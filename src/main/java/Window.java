import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("WhatsApp на минималках");

        JButton submit = new JButton("Send");
        JPanel buttonP = new JPanel();
        JPanel pnl = new JPanel();

//      pnl.setBackground(Color.BLACK);
        buttonP.setBounds(330, 230, 55, 30);
        buttonP.add(submit);

        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        pnl.setLayout(new BorderLayout());
        pnl.setBounds(0, 0, 330, 260);

        pnl.add(textArea, BorderLayout.CENTER);
        pnl.add(textField, BorderLayout.SOUTH);

        frame.add(pnl);
        frame.add(buttonP);
        frame.setVisible(true);

        ActionListener listener = e -> {
            if (!textField.getText().isEmpty()) {
                System.out.println("Вы: " + textField.getText());
                textArea.setText(textArea.getText().concat(textField.getText()).concat("\n"));
                textField.setText("");
            }
        };

        textField.addActionListener(listener);
        submit.addActionListener(listener);
    }
}

