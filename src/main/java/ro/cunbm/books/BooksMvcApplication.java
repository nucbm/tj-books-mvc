package ro.cunbm.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ro.cunbm.books.entities.Book;
import ro.cunbm.books.repositories.BookRepository;

@SpringBootApplication
public class BooksMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(BooksMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {

            // Beginning Java MVC 1.0_ Model View Controller Development to Build Web, Cloud, and Microservices Applications-Apress (2021)
            bookRepository.save(
                    new Book(null, "Beginning Java MVC 1.0 - Model View Controller Development to Build Web, Cloud, and Microservices Applications", "Apress",2021));

            // Mark Seemann, Steven van Deursen - Dependency Injection Principles, Practices, and Patterns-Manning Publications (2019)
            bookRepository.save(
                    new Book(null, "Dependency Injection - Principles, Practices, and Patterns","Manning Publications", 2019));

            // Mark Heckler - Spring Boot_ Up and Running - Building Cloud Native Java and Kotlin Applications-O'Reilly Media (2021)
            bookRepository.save(
                    new Book(null, "Spring Boot Up and Running - Building Cloud Native Java and Kotlin Applications","O'Reilly Media", 2021));

            // Nilang Patel, Krunal Patel - Java 9 Dependency Injection-Packt Publishing (2018)
            bookRepository.save(
                    new Book(null, "Java 9 Dependency Injection","Packt Publishing",2018));


            //Somnath Musib - Spring Boot in Practice-Manning Publications (2022)
            bookRepository.save(
                    new Book(null, "Spring Boot in Practice","Manning Publications",2022));

            bookRepository.findAll().forEach(b->{
                System.out.println(b.getTitle());
            });
        };
    }
}
