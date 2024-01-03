
package lms.gui.dialog;

import java.awt.Color;
import java.awt.event.KeyEvent;
import lms.gui.JFrameMainSLM;
import lms.util.QueryLMS;


public class JDialogLogin extends javax.swing.JDialog {

    private static String passwordT;
    private static boolean unHidePassword = false;
    private JFrameMainSLM mainFrame;

   
    public JDialogLogin(lms.gui.JFrameMainSLM parent, boolean modal) {
        super(parent, modal);
        this.mainFrame = parent;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldUsernameBack = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPasswordFieldPasswordBack = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Log-in-[AldrinPOS] Dialog");

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(328, 348));
        jPanel1.setPreferredSize(new java.awt.Dimension(328, 348));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsername.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsername.setText("Username");
        jTextFieldUsername.setToolTipText("Email or Username");
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextFieldUsername.setOpaque(false);
        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusLost(evt);
            }
        });
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 135, 200, 30));

        jTextFieldUsernameBack.setEditable(false);
        jTextFieldUsernameBack.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsernameBack.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTextFieldUsernameBack.setForeground(new java.awt.Color(169, 169, 169));
        jTextFieldUsernameBack.setText("Username");
        jTextFieldUsernameBack.setToolTipText("Email or Username");
        jTextFieldUsernameBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextFieldUsernameBack.setFocusable(false);
        jTextFieldUsernameBack.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameBackFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameBackFocusLost(evt);
            }
        });
        jTextFieldUsernameBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameBackActionPerformed(evt);
            }
        });
        jTextFieldUsernameBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameBackKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldUsernameBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 135, 200, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/user.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 135, 34, 30));

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordFieldPassword.setToolTipText("Password");
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(200, 32));
        jPasswordFieldPassword.setOpaque(false);
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 207, -1, -1));

        jPasswordFieldPasswordBack.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jPasswordFieldPasswordBack.setForeground(new java.awt.Color(169, 169, 169));
        jPasswordFieldPasswordBack.setText("Password");
        jPasswordFieldPasswordBack.setToolTipText("Password");
        jPasswordFieldPasswordBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordFieldPasswordBack.setFocusable(false);
        jPasswordFieldPasswordBack.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(jPasswordFieldPasswordBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 207, 200, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/eye slash grey16.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel2FocusLost(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 207, 34, 30));

        jButtonLogin.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonLogin.setMnemonic('L');
        jButtonLogin.setText("Log-in");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 246, 36));

        jLabelMessage.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 30));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 164, 30));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Username");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, 164, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField1.setFocusable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 207, 10, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField2.setFocusable(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 135, 10, 30));

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(319, 374));
        setLocationRelativeTo(null);
    }

    private void jTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusGained
        
        if (jTextFieldUsername.getText().equals("Username")) {
            jTextFieldUsername.setForeground(new Color(51, 51, 51));
            jTextFieldUsername.setText("");

        }
        if (jTextFieldUsername.getText().length() < 1) {
            jPasswordFieldPasswordBack.setEchoChar((char) 0);

        }

        if (jPasswordFieldPassword.getText().equals("Password")) {
            jPasswordFieldPassword.setForeground(new Color(204, 204, 204));
            jPasswordFieldPassword.setEchoChar((char) 0);

        }
    }

    private void jTextFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {
        
        if (jTextFieldUsername.getText().equals("")) {
            jTextFieldUsername.setForeground(new java.awt.Color(169, 169, 169));
            jTextFieldUsername.setText("Username");

        }

        if (jPasswordFieldPassword.getText().equals("Password")) {
            jPasswordFieldPassword.setForeground(new Color(204, 205, 204));
            jPasswordFieldPassword.setEchoChar((char) 0);

        }
    }

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {
        jLabelMessage.setText("");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accessLogin();
        }
    }

    private void jTextFieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {
        if (jTextFieldUsername.getText().equals("")) {
            jTextFieldUsernameBack.setForeground(new java.awt.Color(169, 169, 169));
            jTextFieldUsernameBack.setText("Username");
        }
        if (jTextFieldUsername.getText().length() > 0) {
            jTextFieldUsername.setForeground(new java.awt.Color(51, 51, 51));
            jTextFieldUsernameBack.setText("");
        }
    }

    private void jTextFieldUsernameBackFocusGained(java.awt.event.FocusEvent evt) {

    }

    private void jTextFieldUsernameBackFocusLost(java.awt.event.FocusEvent evt) {
        
    }

    private void jTextFieldUsernameBackActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldUsernameBackKeyPressed(java.awt.event.KeyEvent evt) {
        
    }

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accessLogin();
        }
    }

    private void jPasswordFieldPasswordKeyReleased(java.awt.event.KeyEvent evt) {
        if (jPasswordFieldPassword.getText().equals("")) {
            jPasswordFieldPasswordBack.setForeground(new java.awt.Color(169, 169, 169));
            jPasswordFieldPasswordBack.setText("Password");
        }
        if (jPasswordFieldPassword.getText().length() > 0) {
            jPasswordFieldPassword.setForeground(new java.awt.Color(51, 51, 51));
            jPasswordFieldPasswordBack.setText("");
        }

    }

    private void jLabel2FocusGained(java.awt.event.FocusEvent evt) {

    }

    private void jLabel2FocusLost(java.awt.event.FocusEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/eye slash.png")));
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (isUnHidePassword() == false) {
            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
                jPasswordFieldPassword.setForeground(new java.awt.Color(51, 51, 51));
                jPasswordFieldPassword.setEchoChar((char) 0);
                setUnHidePassword(true);
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/eye.png")));
            }
        } else if (isUnHidePassword() == true) {
            if (jPasswordFieldPassword.getText().equals("Password")) {
                jPasswordFieldPassword.setForeground(new java.awt.Color(51, 51, 51));
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/eye slash grey16.png")));
            }
            setUnHidePassword(false);
            jPasswordFieldPassword.setForeground(new java.awt.Color(204, 204, 204));
            jPasswordFieldPassword.setEchoChar('•');
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/eye slash grey16.png")));

        }

       
    }

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {

    }

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {

        accessLogin();
    }


    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordBack;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextFieldUsername;
    public static javax.swing.JTextField jTextFieldUsernameBack;

   private void accessLogin() {
        int counter = 40000;
        int i = 0;
        if ((jTextFieldUsername.getText().length() == 0) && (jPasswordFieldPassword.getText().length() == 0)) {
            jLabelMessage.setText("Username or Password is empty!");
        }
        if (new QueryLMS().loginUser(jTextFieldUsername.getText(), jPasswordFieldPassword.getText()) == true) {
            new JFrameMainSLM();
            this.dispose();
        } else if (new QueryLMS().loginUser(jTextFieldUsername.getText(), jPasswordFieldPassword.getText()) == false) {
            for (; i <= counter; i++) {
                if (i == counter) {
                    jLabelMessage.setText("Invalid account!!");
                }
            }
            i = 0;
        }
    }


    public static String getPasswordT() {
        return passwordT;
    }

    public static void setPasswordT(String aPasswordT) {
        passwordT = aPasswordT;
    }


    public static boolean isUnHidePassword() {
        return unHidePassword;
    }

 
    public static void setUnHidePassword(boolean aHidePassword) {
        unHidePassword = aHidePassword;
    }

}
