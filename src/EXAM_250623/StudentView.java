package EXAM_250623;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {

    private JButton button;

    public StudentView() {
        // 윈도우
        setTitle("학생 성적 화면");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙 배치

        JButton addButton = new JButton("점수 입력");

    }

    public void putScore() {
        setTitle("성적 입력 화면");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙 배치

        // 컴포넌트
        JLabel nameLabel = new JLabel("이름:");
        JTextField nameField = new JTextField(15);

        JLabel korLabel = new JLabel("국어:");
        JTextField korField = new JTextField(5);

        JLabel engLabel = new JLabel("영어:");
        JTextField engField = new JTextField(5);

        JLabel mathLabel = new JLabel("수학:");
        JTextField mathField = new JTextField(5);

        JButton submitButton = new JButton("제출");


        // 레이아웃 설정
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        add(nameLabel, gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(korLabel, gbc);
        gbc.gridx = 1;
        add(korField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(engLabel, gbc);
        gbc.gridx = 1;
        add(engField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(mathLabel, gbc);
        gbc.gridx = 1;
        add(mathField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(submitButton, gbc);


        // 버튼 이벤트
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String kor = korField.getText();
                String eng = engField.getText();
                String math = mathField.getText();

                JOptionPane.showMessageDialog(
                        StudentView.this,
                        "이름: " + name + "\n국어: " + kor + "\n영어: " + eng + "\n수학: " + math,
                        "입력 결과",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentView().setVisible(true));
    }
}