package co.sample.springbooksample.repository;


import co.sample.springbooksample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//we need to create an interface from which the ReadingList object will be persisted to the database
//Because we are using Spring Data Jpa, we can do it just by creating an interface that extends JpaRespository interface

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    //By extending the JpaRepository, ReadingListRepository inherits 18 methods that we can use.

  List<Book> findByReader(String reader);
}
