
package lms.model;


public class Penalty {

    private Integer id;
    private Float rate;
    private Boolean active;
    private String dateTime;
    private User user;
    private Integer daysToBorrow;
    private Boolean sunday;
    private Boolean monday;
    private Boolean tuesady;
    private Boolean wednsday;
    private Boolean thursday;
    private Boolean friday;
    private Boolean saturday;
    
    
    

    public Penalty() {

    }

    public Penalty(Integer id, Float penalty, Boolean active, String dateTime, User user) {
        this.id = id;
        this.rate = penalty;
        this.active = active;
        this.dateTime = dateTime;
        this.user = user;

    }

    public Penalty(Float penalty, Boolean active, String dateTime, User user) {
        this.rate = penalty;
        this.active = active;
        this.dateTime = dateTime;
        this.user = user;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Float getRate() {
        return rate;
    }


    public void setRate(Float rate) {
        this.rate = rate;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }


    public String getDateTime() {
        return dateTime;
    }


    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }
    
    public String toString(){
       String p= String.valueOf(getRate());
        return p;
    }


    public Integer getDaysToBorrow() {
        return daysToBorrow;
    }


    public void setDaysToBorrow(Integer daysToBorrow) {
        this.daysToBorrow = daysToBorrow;
    }


    public Boolean getSunday() {
        return sunday;
    }


    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }


    public Boolean getMonday() {
        return monday;
    }


    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    
    public Boolean getTuesady() {
        return tuesady;
    }

    
    public void setTuesady(Boolean tuesady) {
        this.tuesady = tuesady;
    }

    
    public Boolean getWednsday() {
        return wednsday;
    }

    
    public void setWednsday(Boolean wednsday) {
        this.wednsday = wednsday;
    }

   
    public Boolean getThursday() {
        return thursday;
    }

    
    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    
    public Boolean getFriday() {
        return friday;
    }

    
    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

   
    public Boolean getSaturday() {
        return saturday;
    }


    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

}
