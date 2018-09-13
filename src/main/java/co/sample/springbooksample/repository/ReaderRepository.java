package co.sample.springbooksample.repository;

import co.sample.springbooksample.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ReaderRepository extends JpaRepository<Reader,String> {
}
