package pl.coderslab.bookapi.service;

import org.springframework.stereotype.Service;
import pl.coderslab.bookapi.entity.Book;
import pl.coderslab.bookapi.interfaces.BookService;
import pl.coderslab.bookapi.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JpaBookService implements BookService {
    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
}
