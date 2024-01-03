
package lms.util;

public class LoginData {

    private static int id;
    private static String firstname;
    private static String middlename;
    private static String lastname;
    private static String username;
    private static String password;

    public LoginData() {

    }

    public LoginData(int id, String firstname, String middlename, String lastname, String username, String password, int roleId, String role) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }


    public static int getId() {
        return id;
    }

 
    public static void setId(int aId) {
        id = aId;
    }

 
    public static String getFirstname() {
        return firstname;
    }


    public static void setFirstname(String aFirstname) {
        firstname = aFirstname;
    }


    public static String getMiddlename() {
        return middlename;
    }


    public static void setMiddlename(String aMiddlename) {
        middlename = aMiddlename;
    }


    public static String getLastname() {
        return lastname;
    }


    public static void setLastname(String aLastname) {
        lastname = aLastname;
    }


    public static String getUsername() {
        return username;
    }


    public static void setUsername(String aUsername) {
        username = aUsername;
    }


    public static String getPassword() {
        return password;
    }


    public static void setPassword(String aPassword) {
        password = aPassword;
    }



}
