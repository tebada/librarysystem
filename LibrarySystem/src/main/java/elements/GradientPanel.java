/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseMotionListener;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author kurk
 */
public class GradientPanel extends JPanel {

    public Color StartColor = Color.MAGENTA;
    public Color EndColor = Color.BLUE;
    public boolean TransparentControls = true;
    public int GradientFocus = 500;

    public Color getkStartColor() {
        return StartColor;
    }

    public void setkStartColor(Color kStartColor) {
        this.StartColor = kStartColor;
    }

    public Color getkEndColor() {
        return EndColor;
    }

    public void setkEndColor(Color kEndColor) {
        this.EndColor = kEndColor;
    }

    public boolean iskTransparentControls() {
        return TransparentControls;
    }

    public void setkTransparentControls(boolean kTransparentControls) {
        this.TransparentControls = kTransparentControls;
    }

    public int getkGradientFocus() {
        return GradientFocus;
    }

    public void setkGradientFocus(int kGradientFocus) {
        this.GradientFocus = kGradientFocus;
    }
  
 
    
    

    public GradientPanel() {

        if (TransparentControls) {
            setBg(true);
        } else {
            setBg(false);
        }

    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        super.addMouseMotionListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();

        GradientPaint gp = new GradientPaint(0, 0, StartColor, GradientFocus, h, EndColor);;

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        //g2d.dispose();
    }

    private void setBg(boolean isOpaque) {
        Component[] components = this.getComponents();
        for (Component component : components) {

            ((JLabel) component).setOpaque(isOpaque);
            ((JCheckBox) component).setOpaque(isOpaque);
            ((JTextField) component).setOpaque(isOpaque);
            ((JPasswordField) component).setOpaque(isOpaque);
            ((JFormattedTextField) component).setOpaque(isOpaque);
            ((JToolBar) component).setOpaque(isOpaque);
            ((JRadioButton) component).setOpaque(isOpaque);

        }
    }

}
