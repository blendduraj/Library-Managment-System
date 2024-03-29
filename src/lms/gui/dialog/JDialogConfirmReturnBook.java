/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.gui.dialog;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.sql.Blob;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lms.model.BookBorrow;
import lms.util.QueryLMS;

/**
 *
 * @author Aldrin
 */
public class JDialogConfirmReturnBook extends javax.swing.JDialog {

    private QueryLMS query = new QueryLMS();
    private lms.gui.JFrameMainSLM mainFrame;
    private BookBorrow bookBorrow = new BookBorrow();
    private lms.model.Student student = new lms.model.Student();
    private lms.model.Book book = new lms.model.Book();

    /**
     * Creates new form JDialogConfirmReturnBook
     */
    public JDialogConfirmReturnBook(lms.gui.JFrameMainSLM parent, boolean modal, lms.model.Student student, lms.model.Book book) {
        super(parent, modal);
        this.mainFrame = parent;
        initComponents();
        this.student = student;
        this.book = book;
        displayStudentPicture();
        displayBookPicture();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBookPicture = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelStudentPicture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Return");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelBookPicture.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabelBookPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBookPicture.setText("No Photo");
        jLabelBookPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBookPictureMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelBookPicture, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelStudentPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/no photo.jpg"))); // NOI18N
        jLabelStudentPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStudentPictureMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelStudentPicture, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 180, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 500, -1));

        jButton1.setMnemonic('O');
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, 30));

        jButton2.setMnemonic('C');
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 120, 30));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Return");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, 80));

        setSize(new java.awt.Dimension(534, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBookPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBookPictureMouseClicked

    }//GEN-LAST:event_jLabelBookPictureMouseClicked

    private void jLabelStudentPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStudentPictureMouseClicked

    }//GEN-LAST:event_jLabelStudentPictureMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Click yes if you want to continue?", "Return Book Confirmation", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            bookBorrow.setStudent(student);
            bookBorrow.setBook(book);
            query.returnBoorowedBooks(bookBorrow);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int res = JOptionPane.showConfirmDialog(rootPane, "Click yes if you want to continue?", "Return Book Confirmation", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                bookBorrow.setStudent(student);
                bookBorrow.setBook(book);
                query.returnBoorowedBooks(bookBorrow);
                this.dispose();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBookPicture;
    private javax.swing.JLabel jLabelStudentPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    private void displayStudentPicture() {
        try {
            Blob blobImage = (Blob) query.selectedStudentPicture(student);
            ImageIcon icon = new ImageIcon(blobImage.getBytes(1L, (int) blobImage.length()));

            Image image = icon.getImage();

            int IMG_WIDTH = 178;
            int IMG_HEIGHT = 178;
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

            jLabelStudentPicture.setIcon(new ImageIcon(resizedImage));//image to label

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayBookPicture() {
        try {
            Blob blobImage = (Blob) query.selectedBookPhoto(book);
            if (blobImage == null) {
                jLabelBookPicture.setIcon(null);
                jLabelBookPicture.setText("No Photo");
                return;
            }
            ImageIcon icon = new ImageIcon(blobImage.getBytes(1L, (int) blobImage.length()));

            Image image = icon.getImage();

            int IMG_WIDTH = 178;
            int IMG_HEIGHT = 178;
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

            jLabelBookPicture.setIcon(new ImageIcon(resizedImage));//image to label

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
