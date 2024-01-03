
package lms.xsupport;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class AutoCompleteTextField extends JTextField implements KeyListener,
            DocumentListener {
    private ArrayList<String> possibilities;
    private int currentGuess;
    private Color incompleteColor;
    private boolean areGuessing;
    private boolean caseSensitive;


    public AutoCompleteTextField() {
        this(5, false);
    }


    public AutoCompleteTextField(int columns) {
        this(columns, false);
    }


    public AutoCompleteTextField(int columns, boolean caseSensitive) {
        super.setColumns(columns);
        this.possibilities = new ArrayList<String>();
        this.incompleteColor = Color.GRAY.brighter();
        this.currentGuess = -1;
        this.areGuessing = false;
        this.caseSensitive = caseSensitive;
        this.addKeyListener(this);
        this.getDocument().addDocumentListener(this);
    }


    public void addPossibility(String possibility) {
        this.possibilities.add(possibility);
        Collections.sort(possibilities);
    }


    public void removePossibility(String possibility) {
        this.possibilities.remove(possibility);
    }


    public void removeAllPossibilities() {
        this.possibilities = new ArrayList<String>();
    }


    public void setIncompleteColor(Color incompleteColor) {
        this.incompleteColor = incompleteColor;
    }


    private String getCurrentGuess() {
        if (this.currentGuess != -1)
            return this.possibilities.get(this.currentGuess);

        return this.getText();
    }


    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    private void findCurrentGuess() {
        String entered = this.getText();
        if (!this.caseSensitive)
            entered = entered.toLowerCase();

        for (int i = 0; i < this.possibilities.size(); i++) {
            currentGuess = -1;

            String possibility = this.possibilities.get(i);
            if (!this.caseSensitive)
                possibility = possibility.toLowerCase();
            if (possibility.startsWith(entered)) {
                this.currentGuess = i;
                break;
            }
        }
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        this.areGuessing = false;
        this.currentGuess = -1;
    }

    @Override
    public void paintComponent(Graphics g) {
        String guess = this.getCurrentGuess();
        String drawGuess = guess;

        super.paintComponent(g);
        String entered = this.getText();
        Rectangle2D enteredBounds = g.getFontMetrics().getStringBounds(entered, g);

        if (!(this.caseSensitive)) {
            entered = entered.toLowerCase();
            guess = guess.toLowerCase();
        }
        
        if (!(guess.startsWith(entered)))
            this.areGuessing = false;

        if (entered != null && !(entered.equals("")) 
                && this.areGuessing) {
            String subGuess = drawGuess.substring(entered.length(), drawGuess.length());
            Rectangle2D subGuessBounds = g.getFontMetrics().getStringBounds(drawGuess, g);

            int centeredY = ((getHeight() / 2) + (int)(subGuessBounds.getHeight() / 2));

            g.setColor(this.incompleteColor);
            g.drawString(subGuess + "   press ENTER to send or \u2192 to fill", (int)(enteredBounds.getWidth()) + 2, centeredY - 2);
        }
    }

    public void keyTyped(KeyEvent e) { }

    public void keyPressed(KeyEvent e) { 
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.areGuessing) {
                this.setText(this.getCurrentGuess());
                this.areGuessing = false;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (this.areGuessing) {
                this.setText(this.getCurrentGuess());
                this.areGuessing = false;
                e.consume();
            }
        }
    }
    
    public void keyReleased(KeyEvent e) { }

    public void insertUpdate(DocumentEvent e) {
        String temp = this.getText();

        if (temp.length() == 1)
            this.areGuessing = true;

        if (this.areGuessing)
            this.findCurrentGuess();

    }

    public void removeUpdate(DocumentEvent e) {
        String temp = this.getText();

        if (!(this.areGuessing))
            this.areGuessing = true;

        if (temp.length() == 0)
            this.areGuessing = false;
        else if (this.areGuessing) {
            this.findCurrentGuess();
        }
    }

    public void changedUpdate(DocumentEvent e) { }
}