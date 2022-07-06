package com.annotator.MainWindow;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    private final static int SITE_N = 2; // 取り扱うサイト数
    private final static int INIT_X = 100;
    private final static int INIT_Y = 100;
    private final static int INIT_W = 600;
    private final static int INIT_H = 600;
    private final static String TITLE = "Crawler";
    private final static String[] SITE_NAME_LIST = {"Yahoo", "Merucari"};
    public MainWindow() {
        super();
        setTitle(TITLE);
        setBounds(INIT_X, INIT_Y, INIT_W, INIT_H);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

        });


    }

    
    
}
