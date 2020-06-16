package guru.springwork.spring5webapp.controllers;


import guru.springwork.spring5webapp.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
    public class BookController {

        private final BookRepository bookRepository;

        public BookController(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        @RequestMapping("/books")
        public String getBooks(Model model){

            log.info("model={}", model);

            model.addAttribute("books", bookRepository.findAll());

            return "books/list";
        }
    }


