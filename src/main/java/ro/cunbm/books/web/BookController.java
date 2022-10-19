package ro.cunbm.books.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.cunbm.books.entities.Book;
import ro.cunbm.books.repositories.BookRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private BookRepository bookRepository;

    @GetMapping(path = "/index")
    public String books(Model model){
        List<Book> books = bookRepository.findAll();
        model.addAttribute("listBooks", books);
        return "books";
    }
}
