
package lms.model;

import java.io.File;
import java.sql.Blob;

public abstract class Person {

    private Integer id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String mobileNo;
    private String address;
    private String email;
    private String gender;
    private File photo;
    private String dateOfBirth;

    public Person() {

    }

    public Person(Integer id, String firstname, String middlename, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }

    public Person(String firstname, String middlename, String lastname, String mobileNo, String address, String email, String gender, File photo, String birthDate) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
        this.gender = email;
        this.photo = photo;
        this.dateOfBirth = birthDate;
    }

    public Person(Integer id, String firstname, String middlename, String lastname, String mobileNo, String address, String email, String gender, File photo, String birthDate) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
        this.gender = email;
        this.photo = photo;
        this.dateOfBirth = birthDate;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getMiddlename() {
        return middlename;
    }


    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getMobileNo() {
        return mobileNo;
    }


    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

  


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public File getPhoto() {
        return photo;
    }


    public void setPhoto(File photo) {
        this.photo = photo;
    }

}
