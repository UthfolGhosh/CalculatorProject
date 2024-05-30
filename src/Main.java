import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    double number;
    double answer;
    int calculation;
    JFrame fram = new JFrame();
    JButton button = new JButton();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("<-");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    JButton button_off = new JButton("Off");
    JButton button_on = new JButton("on");
    JButton button_pow= new JButton("^");


    Color yellow = new Color(255, 209, 102);

    public Calculator() {
        fram = new JFrame("Calculator");
        fram.setSize(347, 500);
        fram.setLayout(null);
        fram.getContentPane().setBackground(yellow);
        fram.setVisible(true);
        fram.setResizable(false);
        fram.setLocationRelativeTo(null);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBounds(0, 45, 337, 80);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.white);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        fram.add(textField);

        buttonSeven.setBounds(10, 210, 70, 50);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(Color.DARK_GRAY);
        buttonSeven.setForeground(Color.white);
        fram.add(buttonSeven);

        buttonEight.setBounds(90, 210, 70, 50);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(Color.DARK_GRAY);
        buttonEight.setForeground(Color.white);
        fram.add(buttonEight);

        buttonNine.setBounds(170, 210, 70, 50);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(Color.DARK_GRAY);
        buttonNine.setForeground(Color.white);
        fram.add(buttonNine);

        buttonFour.setBounds(10, 270, 70, 50);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(Color.DARK_GRAY);
        buttonFour.setForeground(Color.white);
        fram.add(buttonFour);

        buttonFive.setBounds(90, 270, 70, 50);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(Color.DARK_GRAY);
        buttonFive.setForeground(Color.white);
        fram.add(buttonFive);

        buttonSix.setBounds(170, 270, 70, 50);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(Color.DARK_GRAY);
        buttonSix.setForeground(Color.white);
        fram.add(buttonSix);

        buttonOne.setBounds(10, 330, 70, 50);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(Color.DARK_GRAY);
        buttonOne.setForeground(Color.white);
        fram.add(buttonOne);

        buttonTwo.setBounds(90, 330, 70, 50);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(Color.DARK_GRAY);
        buttonTwo.setForeground(Color.white);
        fram.add(buttonTwo);

        buttonThree.setBounds(170, 330, 70, 50);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(Color.DARK_GRAY);
        buttonThree.setForeground(Color.white);
        fram.add(buttonThree);

        buttonZero.setBounds(10, 390, 70, 50);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(Color.DARK_GRAY);
        buttonZero.setForeground(Color.white);
        fram.add(buttonZero);

        buttonDot.setBounds(90, 390, 70, 50);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(Color.DARK_GRAY);
        buttonDot.setForeground(Color.white);
        fram.add(buttonDot);

        buttonDiv.setBounds(170, 390, 70, 50);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.DARK_GRAY);
        buttonDiv.setForeground(Color.white);
        fram.add(buttonDiv);

        buttonEqual.setBounds(250, 390, 70, 50);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.DARK_GRAY);
        buttonEqual.setForeground(Color.white);
        fram.add(buttonEqual);

        button_pow.setBounds(250, 330, 70, 50);
        button_pow.setFont(new Font("Arial", Font.BOLD, 20));
        button_pow.setBackground(Color.DARK_GRAY);
        button_pow.setForeground(Color.white);
        fram.add(button_pow);

        buttonMinus.setBounds(250, 210, 70, 50);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.DARK_GRAY);
        buttonMinus.setForeground(Color.white);
        fram.add(buttonMinus);

        buttonPlus.setBounds(250, 270, 70, 50);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.DARK_GRAY);
        buttonPlus.setForeground(Color.white);
        fram.add(buttonPlus);

        button_off.setBounds(10, 150, 70, 25);
        button_off.setFont(new Font("Arial", Font.ITALIC, 15));
        button_off.setBackground(Color.DARK_GRAY);
        button_off.setForeground(Color.pink);
        fram.add(button_off);

        button_on.setBounds(10, 178, 70, 25);
        button_on.setFont(new Font("Arial", Font.ITALIC, 15));
        button_on.setBackground(Color.DARK_GRAY);
        button_on.setForeground(Color.pink);
        fram.add(button_on);

        buttonClear.setBounds(90, 150, 70, 50);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClear.setBackground(Color.DARK_GRAY);
        buttonClear.setForeground(Color.white);
        fram.add(buttonClear);

        buttonDelete.setBounds(170, 150, 70, 50);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDelete.setBackground(Color.DARK_GRAY);
        buttonDelete.setForeground(Color.white);
        fram.add(buttonDelete);

        buttonMul.setBounds(250, 150, 70, 50);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(Color.DARK_GRAY);
        buttonMul.setForeground(Color.white);
        fram.add(buttonMul);

        JLabel write = new JLabel("CASIO ");
        write.setBounds(10,3,80,40);
        write.setFont(new Font("Arial",Font.ITALIC,20));
        write.setBackground(Color.BLACK);
        fram.add(write);

        JLabel Another_write = new JLabel("f(x)~100MS ");
        Another_write.setBounds(220,3,110,40);
        Another_write.setFont(new Font("Arial",Font.ITALIC,20));
        Another_write.setBackground(Color.BLACK);
        fram.add(Another_write);

        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
        button_off.addActionListener(this);
        button_on.addActionListener(this);
        buttonMul.addActionListener(this);

        buttonMinus.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonSeven.addActionListener(this);

        buttonPlus.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonFour.addActionListener(this);

        button_pow.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonOne.addActionListener(this);

        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonDiv.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button_off) {
            disable();
        }else if(source==button_on){
            Active_Button();
        }else if(source == buttonClear) {
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
        } else if (source==buttonDot) {
            if(textField.getText().contains("."))
                return;
            else
                textField.setText(textField.getText()+".");
        } else if (source == buttonOne || source == buttonTwo || source == buttonThree || source == buttonFour || source == buttonFive || source == buttonSix || source == buttonSeven || source == buttonEight || source == buttonNine) {
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getText();
            textField.setText(textField.getText() + buttonText);
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        }
        else if(source==buttonPlus || source==buttonMinus || source==buttonMul || source==buttonDiv ||source==button_pow){
            String str = textField.getText();
            number = Double.parseDouble(str);
            textField.setText("");

            if (source == buttonPlus) {
                calculation = 1;
            } else if (source == buttonMinus) {
                calculation = 2;
            } else if (source == buttonMul) {
                calculation = 3;
            } else if (source == buttonDiv) {
                calculation = 4;
            } else if(source == button_pow){
                calculation=5;
            }
        } else if (source==buttonEqual) {
            switch (calculation){
                case 1:
                    calculateAndSetText(number, 1);
                    break;
                case 2:
                    calculateAndSetText(number, 2);
                    break;
                case 3:
                    calculateAndSetText(number, 3);
                    break;
                case 4:
                    calculateAndSetText(number, 4);
                    break;
                case 5:
                    calculateAndSetText(number,5);
            }
        }

    }
    private void calculateAndSetText(double number,int operation) {
        switch (operation) {
            case 1:
                answer = number+Double.parseDouble(textField.getText());
                break;
            case 2:
                answer = number-Double.parseDouble(textField.getText());
                break;
            case 3:
                answer = number*Double.parseDouble(textField.getText());
                break;
            case 4:
                answer = number/Double.parseDouble(textField.getText());
                break;
            case 5:
                answer = Math.pow(number, Double.parseDouble(textField.getText()));
                break;
        }
        String answerString = Double.toString(answer);
        textField.setText(answerString.endsWith(".0") ? answerString.replace(".0", "") : answerString);
    }


    public void disable(){
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }

    public void Active_Button() {
        textField.setText("");
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        button_pow.setEnabled(true);
        button_off.setEnabled(true);
    }

}

public class Main {
    public static void main(String[] args) {

        new Calculator();
    }
}
