package com.java.starter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField Display;
    private JButton buttonResult;
    private JButton buttonDivision;
    private JButton buttonMultiply;
    private JButton buttonMinus;
    private JButton ACButton;
    private JButton ButtonBack;
    private JButton Button7;
    private JButton Button4;
    private JButton Button1;
    private JButton a0Button;
    private JButton ButtonNegate;
    private JButton Button8;
    private JButton Button5;
    private JButton Button2;
    private JButton a00Button;
    private JButton buttonPlus;
    private JButton Button9;
    private JButton Button6;
    private JButton Button3;
    private JButton buttonDot;

    double a,b,result;
    String digit;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(" ");
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button7.getText());
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button8.getText());

            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button9.getText());

            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button4.getText());

            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button5.getText());

            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button6.getText());

            }
        });
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button1.getText());

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button2.getText());

            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + Button3.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a0Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a00Button.getText());
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Display.getText().contains("."))
                {
                    Display.setText(Display.getText() + buttonDot.getText());
                }
            }
        });
        ButtonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        ButtonNegate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Display.getText().contains(".")){
                    double db = Double.parseDouble(Display.getText());
                    db = db*-1;
                    Display.setText(String.valueOf(db));
                }else{
                    long lg = Long.parseLong(Display.getText());
                    lg = lg*-1;
                    Display.setText(String.valueOf(lg));
                }
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                digit = "+";
                Display.setText("");

            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                digit = "-";
                Display.setText("");
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                digit = "*";
                Display.setText("");
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                digit = "/";
                Display.setText("");
            }
        });
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                b = Double.parseDouble(Display.getText());

                if (digit == "+") {
                    result = a + b;
                    Display.setText(String.valueOf(result));
                } else if (digit == "-") {
                    result = a - b;
                    Display.setText(String.valueOf(result));
                } else if (digit == "*") {
                    result = a * b;
                    Display.setText(String.valueOf(result));
                }else if(digit=="/") {
                    result = a / b;
                    Display.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    }

