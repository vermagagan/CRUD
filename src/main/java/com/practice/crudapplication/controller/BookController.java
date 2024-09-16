package com.practice.crudapplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.crudapplication.model.Book;
import com.practice.crudapplication.repository.Bookrepo;

@RestController
public class BookController {

    @Autowired
    private Bookrepo bookrepo;

    @GetMapping("/getAllbooks")
    public ResponseEntity<List<Book>> getAllbooks()
    {
        try{

            List<Book> booklist=new ArrayList<>();
            bookrepo.findAll().forEach(booklist:: add);


            if(booklist.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(booklist, HttpStatus.OK);
        }


        catch( Exception e)
        {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getBookbyId/{id}")
    public ResponseEntity<Book> getBookbyId(@PathVariable Long id)
    {

        Optional<Book> bookdata = bookrepo.findById(id);

        if(bookdata.isPresent())
            return new ResponseEntity<>(bookdata.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book)
    {
        Book bookobj= bookrepo.save(book);

        return new ResponseEntity<>(bookobj, HttpStatus.OK);
    }

    @PostMapping("/updatebookbyId")
    public ResponseEntity<Book> updateBookbyId(@PathVariable Long id, @RequestBody Book newBookdata)
    {
        Optional<Book> oldbookData = bookrepo.findById(id);

        if(oldbookData.isPresent())
        {
            Book  updatedbook=oldbookData.get();
            updatedbook.setTitle(newBookdata.getTitle());
            updatedbook.setAuthor(newBookdata.getAuthor());

            Book obj = bookrepo.save(updatedbook);
            return new ResponseEntity<>(obj, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/deleteBookbyId")
    public ResponseEntity<HttpStatus> deleteBookbyId(@PathVariable Long id)
    {
        Optional<Book> bookdata = bookrepo.findById(id);
        if(bookdata.isPresent())
        {
            bookrepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
