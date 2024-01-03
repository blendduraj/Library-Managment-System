package lms.util;


import java.util.ArrayList;

public class ComboBoxList {

    private String id;
    private String name;
    

    public ComboBoxList() {
    }

    public ComboBoxList(String ids, String description) {
        this.id = ids;
        this.name = description;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSelectedId(ArrayList<ComboBoxList> Comboboxs, String Id, javax.swing.JComboBox cbo) {
        for (ComboBoxList it : Comboboxs) {
            if (it.getId().toString().equals(Id)) {
                cbo.setSelectedItem(it);
            }

        }
    }

    public void setSelectedDescription(ArrayList<ComboBoxList> Comboboxs, String desc, javax.swing.JComboBox cbo) {
        for (ComboBoxList it : Comboboxs) {
            if (it.getName().trim().equals(desc.trim())) {
                cbo.setSelectedItem(it);
            }
        }
    }

    public String toString() {
        return this.name;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
    


}
