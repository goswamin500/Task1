import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCount extends JFrame {
    private JTextField t1, t2;
    private JLabel l1, l2;
    private JButton countButton;

    public CharacterCount() {
        // Set up the JFrame
        setTitle("Character Count Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        t1 = new JTextField(30);
        t2 = new JTextField(20);
        t2.setEditable(false); // Make the second text field read-only
        l1 = new JLabel("Enter text:");
        l2 = new JLabel("Character count:");
        countButton = new JButton("Count");

        // Set up layout
        setLayout(new GridLayout(3, 3));

        // Add components to the JFrame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(countButton);

        // Add action listener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the first text field
                String inputText = t1.getText();

                // Count the characters
                int charCount = inputText.length();

                // Display the count in the second text field
                t2.setText(Integer.toString(charCount));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CharacterCount().setVisible(true);
            }
        });
    }
}
