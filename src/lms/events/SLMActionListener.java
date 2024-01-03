
package lms.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lms.gui.JFrameMainSLM;

public class SLMActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Exit")) {
            System.exit(0);

        } else if (command.equals("Close")) {
        } else if (command.equals("Log-in")) {
        }

    }

}
