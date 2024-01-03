
package lms.model;

import java.io.File;
import java.sql.Blob;
import java.util.ArrayList;


public class Book {

    private Integer id;
    private String isbn;
    private String title;
    private ArrayList<Author> authorList;
    private Publisher publisher;
    private String description;
    private String notes;
    private String subjects;
    private Integer quantity;
    private Float price;
    private String url;
    private CallNumberLine1 callNoLine1;
    private String callNoLine2;
    private String callNoLine3;
    private String callNoLine4;
    private Genre genre; 
    private BookRecieve bookRecieve;
    private File photo;
    private String authorsName;
    

    public Book() {

    }

    public Book(Integer id,String isbn,String title, ArrayList<Author> authorList, Publisher publisher, String description, String notes, String subjects, Integer quantity, Float price, String url, CallNumberLine1 callNumberLine1, String callNumberLine2, String callNumberLine3, String callNumberLine4, Genre genre) {
        this.id = id;
        this.isbn = isbn;
        this.title =title;
        this.authorList = authorList;
        this.publisher = publisher;
        this.description = description;
        this.notes = notes;
        this.subjects = subjects;
        this.quantity = quantity;
        this.price = price;
        this.url = url;
        this.callNoLine1 = callNumberLine1;
        this.callNoLine2 = callNumberLine2;
        this.callNoLine3 = callNumberLine3;
        this.callNoLine4 = callNumberLine4;
        this.genre = genre;
    }

    public Book(String isbn,String title, ArrayList<Author> authorList, Publisher publisher, String description, String notes, String subjects, Integer quantity, Float price, String url, CallNumberLine1 callNumberLine1, String callNumberLine2, String callNumberLine3, String callNumberLine4, Genre genre) {
        this.id = id;
        this.isbn = isbn;
        this.title =title;
        this.authorList = authorList;
        this.publisher = publisher;
        this.description = description;
        this.notes = notes;
        this.subjects = subjects;
        this.quantity = quantity;
        this.price = price;
        this.url = url;
        this.callNoLine1 = callNumberLine1;
        this.callNoLine2 = callNumberLine2;
        this.callNoLine3 = callNumberLine3;
        this.callNoLine4 = callNumberLine4;
        this.genre = genre;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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



    public Publisher getPublisher() {
        return publisher;
    }


    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getNotes() {
        return notes;
    }


    public void setNotes(String notes) {
        this.notes = notes;
    }


    public String getSubjects() {
        return subjects;
    }


    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Float getPrice() {
        return price;
    }


    public void setPrice(Float price) {
        this.price = price;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public CallNumberLine1 getCallNoLine1() {
        return callNoLine1;
    }


    public void setCallNoLine1(CallNumberLine1 callNoLine1) {
        this.callNoLine1 = callNoLine1;
    }


    public String getCallNoLine2() {
        return callNoLine2;
    }


    public void setCallNoLine2(String callNoLine2) {
        this.callNoLine2 = callNoLine2;
    }


    public String getCallNoLine3() {
        return callNoLine3;
    }


    public void setCallNoLine3(String callNoLine3) {
        this.callNoLine3 = callNoLine3;
    }


    public String getCallNoLine4() {
        return callNoLine4;
    }

 
    public void setCallNoLine4(String callNoLine4) {
        this.callNoLine4 = callNoLine4;
    }


    public Genre getGenre() {
        return genre;
    }


    public void setGenre(Genre genre) {
        this.genre = genre;
    }



    public ArrayList<Author> getAuthorList() {
        return authorList;
    }


    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }

    public BookRecieve getBookRecieve() {
        return bookRecieve;
    }


    public void setBookRecieve(BookRecieve bookRecieve) {
        this.bookRecieve = bookRecieve;
    }


    public String getAuthorsName() {
        return authorsName;
    }


    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }
    public String toString(){
        return getTitle();
    }

}
