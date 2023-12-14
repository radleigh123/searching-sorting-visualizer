package antjava;

import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        System.out.println("PROGRAM STARTING...");

        try {
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.themes.FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

        System.out.println("PROGRAM TERMINATED...");
    }

}
