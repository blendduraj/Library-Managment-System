
package lms;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import lms.gui.JFrameLogin;

public class LMS {

   
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceCeruleanLookAndFeel");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Substance Graphite failed to initialize");
                }
                lms.util.DBConnection c = new lms.util.DBConnection();
                new lms.util.DBConnection().getDBConn();
                if (c.getCon() != null) {
                    JFrameLogin login = new JFrameLogin();
                    login.setVisible(true);
                }

            }
        });

    }

}
