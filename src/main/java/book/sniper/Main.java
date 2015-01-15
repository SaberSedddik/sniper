package book.sniper;

import javax.swing.*;

/**
 * Created by saberseddik on 15-01-14.
 */
public class Main {
    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
    private MainWindow ui;
    public Main()throws Exception {
        startUserInterface();
    }
    public static void main(String... args) throws Exception{
        Main main = new Main();
    }

    private void startUserInterface()throws Exception{
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                ui = new MainWindow();
            }
        });
    }
}
