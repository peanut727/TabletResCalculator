import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form1 {
    private JTextPane height;
    private JLabel label1;
    private JRadioButton square;
    private JRadioButton rectangle;
    private JLabel res;
    private JButton calculate;
    JPanel ResCalc;
    double h,answer;


    private void ch1() {

        answer = (4.0 / 3.0) * h;

    }

    private void ch2() {

        answer = (16.0 / 9.0) * h;

    }

    public form1() {

        ButtonGroup G = new ButtonGroup();
        G.add(square);
        G.add(rectangle);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (square.isSelected()){

                    h = Double.parseDouble(height.getText());
                    ch1();
                    res.setText(String.valueOf(Math.round(answer) + " x " + Math.round(h) ));


                } else if (rectangle.isSelected()){

                    h = Double.parseDouble(height.getText());
                    ch2();
                    res.setText(String.valueOf(Math.round(answer) + " x " + Math.round(h) ));
                }

            }
        });
    }
}
