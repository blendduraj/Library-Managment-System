
package lms.model;


public class Author {

    private int id;
    private String firstname;
    private String middlename;
    private String lastname;

    private Author author;

    public Author() {

    }

    public Author(int id, String firstname, String middlename, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

 
    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getMiddlename() {
        return middlename;
    }


    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

 
    public Author getAuthor() {
        return author;
    }


    public void setAuthor(Author author) {
        this.author = author;
    }

}
