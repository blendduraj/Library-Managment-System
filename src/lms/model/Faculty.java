
package lms.model;

import java.io.File;
import java.sql.Blob;

public class Faculty extends Person {

    private Long barcode;
    private Blob picture;

    public Faculty() {

    }

    public Faculty(String firstname, String middlename, String lastname, String mobileNo, String address, String email, String gender, File photo, Long barcode) {
     
    }


    public Long getBarcode() {
        return barcode;
    }


    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

  


    public Blob getPicture() {
        return picture;
    }


    public void setPicture(Blob picture) {
        this.picture = picture;
    }

}
