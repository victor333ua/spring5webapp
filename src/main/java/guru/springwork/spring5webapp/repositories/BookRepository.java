package guru.springwork.spring5webapp.repositories;

import guru.springwork.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
