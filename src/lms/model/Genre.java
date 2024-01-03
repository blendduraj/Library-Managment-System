
package lms.model;


public class Genre {
    private int id;
    private Type type;
    private String genre;
    private String description;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Type getType() {
        return type;
    }

 
    public void setType(Type type) {
        this.type = type;
    }

 
    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
