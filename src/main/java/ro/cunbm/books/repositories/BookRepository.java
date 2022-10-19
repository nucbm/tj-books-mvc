package ro.cunbm.books.repositories;

import ro.cunbm.books.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
