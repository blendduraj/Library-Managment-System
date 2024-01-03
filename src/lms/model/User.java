
package lms.model;


public class User extends Person implements ManageRole {

    private RoleList roleList;
    private Role role;
    public  User(){
        
    }

    public User(Integer id, String firstname, String middlename, String lastname, String username, String password) {
        super(id, firstname, middlename, lastname);
        this.username = username;
        this.password = password;
    }
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public RoleList getRoleList() {
        return roleList;
    }


    public void setRoleList(RoleList roleList) {
        this.roleList = roleList;
    }

    @Override
    public void userRole(RoleList role) {
        switch (role) {
            case Administrator:

            case Director:

            case Librarian:


        }
    }


    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }

}
