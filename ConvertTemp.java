// Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertTemp extends JFrame {

    // Create two private JTextFields as part of the JFrame class
    private JTextField fahrenField = new JTextField();
    private JTextField celsiusField = new JTextField();

    // Constructor
    public ConvertTemp(String title) {
        // Set title for frame and choose layout
        super(title);
        getContentPane().setLayout(new GridLayout(2, 2));

        // Add Fahrenheit label and text field to frame
        add(new JLabel("Fahrenheit"));
        add(fahrenField);
        fahrenField.addActionListener(new FahrenheitListener());

        // Add Celsius label and text field to frame
        add(new JLabel("Celsius:"));
        add(celsiusField);

        // Attach window listener
        addWindowListener(new WindowCloser());
    }//end costructor

    // Listener for window
    class WindowCloser extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }

    class FahrenheitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double fahrenheit = Double.parseDouble(fahrenField.getText());
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            int roundedCelsius = (int) Math.round(celsius); // Changes celsius to a whole number
            celsiusField.setText(String.valueOf(roundedCelsius));
        }
    }

    class CelsiusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            fahrenField.setText(String.valueOf(fahrenheit));
        }
    }
}//end class