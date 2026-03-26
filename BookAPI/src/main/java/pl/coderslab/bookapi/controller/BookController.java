package pl.coderslab.bookapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.coderslab.bookapi.entity.Book;
import pl.coderslab.bookapi.service.JpaBookService;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final JpaBookService jpaBookService;

    public BookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }


    @RequestMapping()
    public List<Book> get() {
        return jpaBookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Long id) {
        return jpaBookService.get(id).orElseThrow(() -> {
            throw new ResponseStatusException
                    (HttpStatus.NOT_FOUND, "Book not found");
        });
    }

    @PostMapping()
    public String add(@RequestBody Book book) {
        jpaBookService.add(book);
        return "Book has been added successfully";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id) {
        jpaBookService.delete(id);
        return "Book has been deleted successfully";
    }

    @PutMapping()
    public String update(@RequestBody Book book) {
        jpaBookService.update(book);
        return "Book has been updated successfully";
    }
}