//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.border.EmptyBorder;
//
//public class Feedback_Admin extends JFrame {
//
//    private static final long serialVersionUID = 1L;
//    private JPanel contentPane;
//    private JTextField textField;
//    private JLabel displayLabel;
//
//    public static void main(String[] args) {
//        EventQueue.invokeLater(() -> {
//            try {
//            	Feedback_Admin frame = new Feedback_Admin();
//                frame.setVisible(true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//    public Feedback_Admin() {
//        setTitle("Admin");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 450, 300);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        contentPane.setLayout(null);
//
//        // Create a label to display the information
//        displayLabel = new JLabel("");
//        displayLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        displayLabel.setBounds(10, 10, 414, 150);
//        contentPane.add(displayLabel);
//
//        // Create a text field for user input
//        textField = new JTextField();
//        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        textField.setBounds(10, 180, 300, 30);
//        contentPane.add(textField);
//        textField.setColumns(10);
//
//        // Create a button to send the input
//        JButton sendButton = new JButton("Gửi");
//        sendButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        sendButton.setBounds(320, 180, 100, 30);
//        contentPane.add(sendButton);
//
//        // Add an action listener to the button
//        sendButton.addActionListener((ActionEvent e) -> {
//            String inputText = textField.getText();
//            displayLabel.setText(inputText);
//            textField.setText("");
//        });
//    }
//}



//import java.awt.EventQueue;
//import java.awt.Font;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.border.EmptyBorder;
//
//public class Feedback_Admin extends JFrame {
//
//    private static final long serialVersionUID = 1L;
//    private JPanel contentPane;
//    private JTextField textField;
//    private JTextArea feedbackDisplay;
//    private Feedback feedbackInstance; // Thêm trường này để lưu instance của Feedback
//
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(() -> {
//            try {
//                Feedback_Admin frame = new Feedback_Admin();
//                frame.setVisible(true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//    /**
//     * Create the frame.
//     */
//    public Feedback_Admin() {
//        setTitle("Admin");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(100, 100, 450, 300);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        contentPane.setLayout(null);
//
//        // Create a text field for user input
//        textField = new JTextField();
//        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        textField.setBounds(10, 180, 300, 30);
//        contentPane.add(textField);
//        textField.setColumns(10);
//
//        // Create a button to send the input
//        JButton sendButton = new JButton("Gửi");
//        sendButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        sendButton.setBounds(320, 180, 100, 30);
//        contentPane.add(sendButton);
//
//        // Add an action listener to the button
//        sendButton.addActionListener(e -> {
//            String inputText = textField.getText();
//
//            // Simulate receiving admin feedback and displaying it
//            receiveAdminFeedback("Admin: " + inputText);
//
//            // Send admin feedback to Feedback instance
//            if (feedbackInstance != null) {
//                feedbackInstance.receiveFeedback("Admin: " + inputText);
//            }
//
//            textField.setText("");
//        });
//
//        // Create a text area to display feedback
//        feedbackDisplay = new JTextArea();
//        feedbackDisplay.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        feedbackDisplay.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(feedbackDisplay);
//        scrollPane.setBounds(10, 10, 410, 150);
//        contentPane.add(scrollPane);
//    }
//
//    // Method to set the Feedback instance
//    public void setFeedbackInstance(Feedback feedbackInstance) {
//        this.feedbackInstance = feedbackInstance;
//    }
//
//    // Method to receive admin feedback from Feedback class
//    public void receiveAdminFeedback(String feedback) {
//        EventQueue.invokeLater(() -> {
//            feedbackDisplay.append(feedback + "\n");
//        });
//    }
//}



import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Feedback_Admin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea feedbackDisplay;
    private Feedback feedbackInstance; // Thêm trường này để lưu instance của Feedback

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Feedback_Admin frame = new Feedback_Admin();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Feedback_Admin() {
        setTitle("Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Create a text field for user input
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField.setBounds(10, 180, 300, 30);
        contentPane.add(textField);
        textField.setColumns(10);

        // Create a button to send the input
        JButton sendButton = new JButton("Gửi");
        sendButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        sendButton.setBounds(320, 180, 100, 30);
        contentPane.add(sendButton);

        // Add an action listener to the button
        sendButton.addActionListener(e -> {
            String inputText = textField.getText();

            // Simulate receiving admin feedback and displaying it
            receiveAdminFeedback("Admin: " + inputText);

            // Send admin feedback to Feedback instance
            if (feedbackInstance != null) {
                feedbackInstance.receiveFeedback("Admin: " + inputText);
            }

            textField.setText("");
        });

        // Create a text area to display feedback
        feedbackDisplay = new JTextArea();
        feedbackDisplay.setFont(new Font("Tahoma", Font.PLAIN, 14));
        feedbackDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(feedbackDisplay);
        scrollPane.setBounds(10, 10, 410, 150);
        contentPane.add(scrollPane);
    }

    // Method to set the Feedback instance
    public void setFeedbackInstance(Feedback feedbackInstance) {
        this.feedbackInstance = feedbackInstance;
    }

    // Method to receive admin feedback from Feedback class
    public void receiveAdminFeedback(String feedback) {
        EventQueue.invokeLater(() -> {
            feedbackDisplay.append(feedback + "\n");
        });
    }
}

