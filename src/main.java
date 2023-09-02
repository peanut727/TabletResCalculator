import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Resolution Calculator");
        form1 form = new form1();
        f.setContentPane(form.ResCalc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);
    }
}
