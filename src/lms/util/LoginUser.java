
package lms.util;


public class LoginUser {

    private static lms.model.User user;


    public static lms.model.User getUser() {
        return user;
    }


    public static void setUser(lms.model.User aUser) {
        user = aUser;
    }

   

}
