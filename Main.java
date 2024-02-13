import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        setTitle("Valentine's Day Gift");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel giftLabel = new JLabel("❤️ Happy Valentine's Day! ❤️");
        giftLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(giftLabel, BorderLayout.CENTER);

        JButton giveGiftButton = new JButton("Give Gift");
        giveGiftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "A special gift for my love: (Add your gift message here)");
            }
        });
        panel.add(giveGiftButton, BorderLayout.SOUTH);

        add(panel);
        setLocationRelativeTo(null); // Center the window on the screen.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
