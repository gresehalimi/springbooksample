package co.sample.springbooksample.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    //Designated as JPA entity
public class Book {

    @Id   //Entity identity
    @GeneratedValue(strategy = GenerationType.AUTO)   //Indicates that this field is the identity of entity, and this value wit
    private long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;


    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }



}
