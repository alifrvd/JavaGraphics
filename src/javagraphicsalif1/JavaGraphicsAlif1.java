/*
 * Program              : JavaGRaphics - Geometrics Wolf Head
 * Tanggal Selesai      : 31-12-2018
 * Dibuat oleh          : Alif Ramdani
 * NIM                  : 171511036
 * Almamater            : JTK Polban 2017
 */
package javagraphicsalif1;

/**
 *
 * @author Alif Ramdani - 171511036
 */

import javax.swing.*;

public class JavaGraphicsAlif1 {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Geometrics Wolf Head");
        MyShape s = new MyShape();
        f.add(s);
        f.setSize(630,700);
        f.setVisible(true);
    }
    
}
