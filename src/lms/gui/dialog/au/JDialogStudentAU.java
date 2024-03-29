/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.gui.dialog.au;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lms.gui.JFrameMainSLM;
import lms.model.Course;
import lms.model.Student;
import lms.util.ComboBoxList;
import lms.util.QueryLMS;

/**
 *
 * @author Aldrin
 */
public class JDialogStudentAU extends javax.swing.JDialog {
    
    private JFrameMainSLM mainMenu;
    private String evt = new String();
    private lms.util.QueryLMS query = new QueryLMS();
    private File pictureFile = null;
    private Student student = new Student();
    private Course course = new Course();
    int IMG_WIDTH = 178;
    int IMG_HEIGHT = 178;

    /**
     * Creates new form JDialogStudentAU
     */
    public JDialogStudentAU(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        comboBoxCourse();
    }
    
    public JDialogStudentAU(lms.gui.JFrameMainSLM parent, boolean modal, String evt) {
        super(parent, modal);
        this.mainMenu = parent;
        initComponents();
        this.evt = evt;
        comboBoxCourse();
    }
    
    public JDialogStudentAU(lms.gui.JFrameMainSLM parent, boolean modal, String evt, Student student) {
        super(parent, modal);
        this.mainMenu = parent;
        this.student = student;
        initComponents();
        this.evt = evt;
        comboBoxCourse();
        jTextFieldFirstname.setText(student.getFirstname());
        jTextFieldMiddlename.setText(student.getMiddlename());
        jTextFieldLastname.setText(student.getLastname());
        jTextFieldEmail.setText(student.getEmail());
        jTextFieldAddress.setText(student.getAddress());
        jTextFieldMobileNo.setText(student.getMobileNo());
        jTextFieldGuardian.setText(student.getGuardian());
        if (student.getGender().equals("Male")) {
            jComboBoxGender.setSelectedIndex(1);
        } else {
            jComboBoxGender.setSelectedIndex(2);
        }
        for (ComboBoxList a : this.query.getList()) {
            a.setSelectedId(query.getList(), String.valueOf(this.student.getId()), jComboBoxCourse);
        }
        jDateChooserDOB.setDate(new Date(Integer.parseInt(student.getDateOfBirth().toString().substring(0, 4)) - 1900, Integer.parseInt(student.getDateOfBirth().toString().substring(5, 7)) - 1, Integer.parseInt(student.getDateOfBirth().substring(8))));
        displayPicture();
    }
    
    public JDialogStudentAU(lms.gui.JFrameMainSLM parent, boolean modal, Student student, String evt) {
        super(parent, modal);
        this.mainMenu = parent;
        this.student = student;
        initComponents();
        this.evt = evt;
        comboBoxCourse();
        jTextFieldFirstname.setText(student.getFirstname());
        jTextFieldMiddlename.setText(student.getMiddlename());
        jTextFieldLastname.setText(student.getLastname());
        jTextFieldEmail.setText(student.getEmail());
        jTextFieldAddress.setText(student.getAddress());
        jTextFieldMobileNo.setText(student.getMobileNo());
        jTextFieldGuardian.setText(student.getGuardian());
        if (student.getGender().equals("Male")) {
            jComboBoxGender.setSelectedIndex(1);
        } else {
            jComboBoxGender.setSelectedIndex(2);
        }
        for (ComboBoxList a : this.query.getList()) {
            a.setSelectedId(query.getList(), String.valueOf(this.student.getId()), jComboBoxCourse);
        }
        jDateChooserDOB.setDate(new Date(Integer.parseInt(student.getDateOfBirth().toString().substring(0, 4)) - 1900, Integer.parseInt(student.getDateOfBirth().toString().substring(5, 7)) - 1, Integer.parseInt(student.getDateOfBirth().substring(8))));
        displayPicture();
        jButton1.setMnemonic('M');
        jButton1.setText("Delete");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMobileNo = new javax.swing.JTextField();
        jTextFieldGuardian = new javax.swing.JTextField();
        jTextFieldMiddlename = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxCourse = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("Photo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 100, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("Middlename");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));

        jTextFieldMobileNo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 124, 130, -1));

        jTextFieldGuardian.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 410, -1));

        jTextFieldMiddlename.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 45, 130, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("Guardian's Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 84, 130, 23));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Mobile No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 270, 23));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel8.setText("Course");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jTextFieldFirstname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 130, -1));

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));

        jTextFieldLastname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 45, 130, -1));

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));
        getContentPane().add(jDateChooserDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 130, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel11.setText("Date of Birth");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 270, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel12.setText("Firstname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        jTextFieldAddress.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 164, 270, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/no photo.jpg"))); // NOI18N
        jLabelPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPictureMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelPicture, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 44, 180, 180));

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel13.setText("Lastname");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(610, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 610, 2));

        jButton1.setMnemonic('S');
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 80, 30));

        setSize(new java.awt.Dimension(657, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            switch (this.evt) {
                case "Add":
                    int reply = JOptionPane.showConfirmDialog(this,
                            "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " ?",
                            "Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (reply == JOptionPane.YES_OPTION) {
                        student.setFirstname(jTextFieldFirstname.getText());
                        student.setMiddlename(jTextFieldMiddlename.getText());
                        student.setLastname(jTextFieldLastname.getText());
                        //jcombobox for course
                        if (jComboBoxCourse.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(mainMenu, "No course selected!! try again.", "Warring!!", JOptionPane.WARNING_MESSAGE);
                            return;
                        } else {
                            ComboBoxList courseIdl = (ComboBoxList) this.jComboBoxCourse.getSelectedItem();
                            course.setId(Integer.parseInt(courseIdl.getId()));
                            student.setCourse(course);
                        }
                        //jcombobox for gender
                        if (jComboBoxGender.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(mainMenu, "No gender selected!! try again.", "Warring!!", JOptionPane.WARNING_MESSAGE);
                            return;
                        } else {
                            
                            student.setGender(jComboBoxGender.getSelectedItem().toString());
                        }
                        student.setEmail(jTextFieldEmail.getText());
                        student.setMobileNo(jTextFieldMobileNo.getText());
                        student.setDateOfBirth(new java.sql.Date(jDateChooserDOB.getDate().getTime()).toString());
                        student.setAddress(jTextFieldAddress.getText());
                        student.setGuardian(jTextFieldGuardian.getText());
                        try {
                            if (pictureFile == null) {
                                int response = JOptionPane.showConfirmDialog(this,
                                        "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " without picture?",
                                        "Student Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                if (response == JOptionPane.YES_OPTION) {
                                    student.setPhoto(new File(System.getProperty("user.dir") + "/src/lms/images/no photo.jpg"));
                                    query.addStudent(student);
                                    JOptionPane.showConfirmDialog(null, "You're saving without picture", "Message", JOptionPane.PLAIN_MESSAGE);
                                }
                            } else {
                                student.setPhoto(new File(System.getProperty("user.dir") + "/src/lms/images/model.jpg"));
                                int response = JOptionPane.showConfirmDialog(this,
                                        "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + "?",
                                        "Student Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                if (response == JOptionPane.YES_OPTION) {
                                    query.addStudent(student);
                                } else if (response == JOptionPane.NO_OPTION) {
                                    System.out.print("");
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        
                    }
                    this.dispose();
                    break;
                
                case "Update":
                    student.setFirstname(jTextFieldFirstname.getText());
                    student.setMiddlename(jTextFieldMiddlename.getText());
                    student.setLastname(jTextFieldLastname.getText());
                    //jcombobox for course
                    if (jComboBoxCourse.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(mainMenu, "No course selected!! try again.", "Warring!!", JOptionPane.WARNING_MESSAGE);
                        return;
                    } else {
                        ComboBoxList courseIdl = (ComboBoxList) this.jComboBoxCourse.getSelectedItem();
                        course.setId(Integer.parseInt(courseIdl.getId()));
                        student.setCourse(course);
                    }
                    //jcombobox for gender
                    if (jComboBoxGender.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(mainMenu, "No gender selected!! try again.", "Warring!!", JOptionPane.WARNING_MESSAGE);
                        return;
                    } else {                 
                        student.setGender(jComboBoxGender.getSelectedItem().toString());
                    }
                    student.setEmail(jTextFieldEmail.getText());
                    student.setMobileNo(jTextFieldMobileNo.getText());
                    student.setDateOfBirth(new java.sql.Date(jDateChooserDOB.getDate().getTime()).toString());
                    student.setAddress(jTextFieldAddress.getText());
                    student.setGuardian(jTextFieldGuardian.getText());
                    try {
                        if (pictureFile == null) {
                            int response = JOptionPane.showConfirmDialog(this,
                                    "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " ?",
                                    "Student Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (response == JOptionPane.YES_OPTION) {
                                student.setPhoto(new File(System.getProperty("user.dir") + "/src/lms/images/no photo.jpg"));
                            }
                        } else {
                            int response = JOptionPane.showConfirmDialog(this,
                                    "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " ?",
                                    "Student Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (response == JOptionPane.YES_OPTION) {
                                student.setPhoto(new File(System.getProperty("user.dir") + "/src/lms/images/model.jpg"));
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    boolean isImage = false;
                    if (pictureFile != null) {
                        student.setPhoto(new File(System.getProperty("user.dir") + "/src/lms/images/model.jpg"));
                        isImage = true;
                    }
                    query.updateStudent(student, isImage);
//                    }
                    this.dispose();
                    break;
                case "Delete":
                    int response = JOptionPane.showConfirmDialog(null, "Are you sure to delete " + student.getFirstname() + " " + student.getLastname() + " ?", "Delete Confirmation!!", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        new QueryLMS().deleteStudent(student);
                        JOptionPane.showMessageDialog(null, student.getFirstname() + " " + student.getLastname() + " is successfully deleted.", "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                    this.dispose();
                    break;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPictureMouseClicked
        browse();
    }//GEN-LAST:event_jLabelPictureMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxCourse;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldGuardian;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldMiddlename;
    private javax.swing.JTextField jTextFieldMobileNo;
    // End of variables declaration//GEN-END:variables
   private void comboBoxCourse() {
        this.jComboBoxCourse.removeAllItems();
        jComboBoxCourse.addItem("Select Course");
        query.comboBoxCourse();
        for (ComboBoxList a : query.getList()) {
            this.jComboBoxCourse.addItem(a);
        }
    }
    
    private void browse() {
        try {
            int returnVal = jFileChooser1.showOpenDialog(this);
            
            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                pictureFile = jFileChooser1.getSelectedFile();
                
                int IMG_WIDTH = jLabelPicture.getWidth();
                int IMG_HEIGHT = jLabelPicture.getHeight();
                
                try {
                    BufferedImage originalImage = ImageIO.read(pictureFile);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
                    
                    BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
                    g.dispose();
                    g.setComposite(AlphaComposite.Src);
                    
                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY);
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    jLabelPicture.setIcon(new ImageIcon(resizedImage)); //to eliminate .jpeg from picture filename
                    ImageIO.write(resizedImage, "png", new File("src\\lms\\images\\model.jpg"));
                    
                } catch (final IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Opss...", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void displayPicture() {
        try {
            Blob blobImage = (Blob) query.selectedStudentPicture(student);
            ImageIcon icon = new ImageIcon(blobImage.getBytes(1L, (int) blobImage.length()));
            
            Image image = icon.getImage();

//            int IMG_WIDTH = jLabelPicture.getWidth();
//            int IMG_HEIGHT = jLabelPicture.getHeight();
            int type = BufferedImage.TYPE_INT_ARGB;
            
            BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(image, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
            g.dispose();
            g.setComposite(AlphaComposite.Src);
            
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            
            jLabelPicture.setIcon(new ImageIcon(resizedImage));//image to label

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
