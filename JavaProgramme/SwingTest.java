import javax.swing.*;
import java.awt.FlowLayout;

public class SwingTest {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Ultimativer Knopfdrücker");
        JButton knopf = new JButton("Drück mich!");
        JLabel label1 = new JLabel("Drücken Sie den knopf!");

        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setLayout(new FlowLayout());
        fenster.setSize(400, 400);
        fenster.setVisible(true);
        fenster.add(label1);
        fenster.add(knopf);
        knopf.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Knopf erfolgreich gedrückt!");
        });
    }
}
