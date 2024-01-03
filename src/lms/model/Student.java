
package lms.model;

import java.io.File;
import java.sql.Blob;


public class Student extends Person {

    private Long barcode;
    private Course course;
    private String guardian;
    private String dobf;
    private Blob picture;

    public Student() {

    }

    public Student(String firstname, String middlename, String lastname, String mobileNo, String address, String email, String gender, File photo, String birthDate, Long barcode, Course course, String guardian) {
        super(firstname, middlename, lastname, mobileNo, address, email, gender, photo, birthDate);
        this.barcode = barcode;
        this.course = course;
        this.guardian = guardian;
    }


    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
    }


    public String getGuardian() {
        return guardian;
    }


    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }


    public Long getBarcode() {
        return barcode;
    }


    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }


    public String getDobf() {
        return dobf;
    }


    public void setDobf(String dobf) {
        this.dobf = dobf;
    }


    public Blob getPicture() {
        return picture;
    }


    public void setPicture(Blob picture) {
        this.picture = picture;
    }

}
