
package lms.model;


public class BookAuthor {

    private int id;
    private Book book;
    private Author author;

    public BookAuthor() {

    }

    public BookAuthor(int id, Book bookId, Author authorId) {
        this.id = id;
        this.book = bookId;
        this.author = authorId;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Book getBook() {
        return book;
    }


    public void setBook(Book book) {
        this.book = book;
    }


    public Author getAuthor() {
        return author;
    }


    public void setAuthor(Author author) {
        this.author = author;
    }

}
