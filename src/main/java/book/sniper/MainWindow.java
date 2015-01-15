package book.sniper;

import javax.swing.*;

/**
 * Created by saberseddik on 15-01-14.
 */
public class MainWindow extends JFrame{
    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";

    public MainWindow(){
        super("Auction Sniper");
        setName(MAIN_WINDOW_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
