package pl.coderslab.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.bookapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
