
package lms.model;


public class Role {
    private int id;
    private RoleList roleList;


    public RoleList getRoleList() {
        return roleList;
    }


    public void setRoleList(RoleList roleList) {
        this.roleList = roleList;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}
