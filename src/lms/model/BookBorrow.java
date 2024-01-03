
package lms.model;


public class BookBorrow extends Book {

    private Student student;
    private User user;
    private Book book;
    private Penalty penalty;
    private Boolean returnBook;
    private Boolean wrongBarcode;


    public Student getStudent() {
        return student;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public Book getBook() {
        return book;
    }


    public void setBook(Book book) {
        this.book = book;
    }


    public Penalty getPenalty() {
        return penalty;
    }


    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }


    public Boolean getReturnBook() {
        return returnBook;
    }


    public void setReturnBook(Boolean returnBook) {
        this.returnBook = returnBook;
    }


    public Boolean getWrongBarcode() {
        return wrongBarcode;
    }


    public void setWrongBarcode(Boolean wrongBarcode) {
        this.wrongBarcode = wrongBarcode;
    }

}
