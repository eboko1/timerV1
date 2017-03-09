package fvi.at;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Vika on 09.03.2017.
 */
public class Windows extends JFrame {
    private final int WIDTH = 400;
    private final int  HEIGHT = 300;

    public Windows(){
       buildWindow();
    }


    public void buildWindow(){
        JFrame frame = new JFrame();
        frame.setTitle(" Timer ");
        frame.add(new WindowPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }



}
