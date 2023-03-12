package Observer;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should i do it");
        button.addActionListener(event -> 
            System.out.println("Dont do it, you might regret it!"));
        button.addActionListener(event ->
            System.out.println("Come on, do it!"));
    }
}
