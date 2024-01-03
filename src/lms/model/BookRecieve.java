
package lms.model;


public class BookRecieve {

    private Integer id;
    private Purchaser purchaser;
    private User user;
    private String reference;

    public BookRecieve() {

    }

    public BookRecieve(Integer id) {
        this.id = id;
    }

    public BookRecieve(Purchaser purchaser, User user) {
        this.purchaser = purchaser;
        this.user = user;
    }

    public BookRecieve(Integer id, Purchaser purchaser, User user) {
        this.id = id;
        this.purchaser = purchaser;
        this.user = user;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Purchaser getPurchaser() {
        return purchaser;
    }


    public void setPurchaser(Purchaser purchaser) {
        this.purchaser = purchaser;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public String getReference() {
        return reference;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }
    
  
}
