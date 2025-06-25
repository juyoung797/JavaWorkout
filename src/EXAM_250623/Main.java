package EXAM_250623;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // scanner 생성
        Scanner sc = new Scanner(System.in);
        // 학생 arraylist 생성
        List<Student> students = new ArrayList<>();
        // 프로그램 반복
        while (true) {
            System.out.println("---");
            System.out.println("이름/국어성적/영어성적/수학성적");
            System.out.println("(형식에 맞게 입력하세요. q를 입력하면 전체 학생 목록이 출력됩니다.)");
            // nextLine scan
            String studentInfo = sc.nextLine();
            // q를 입력하면 종료되도록
            if (studentInfo.equals("q")) {
                break;
            } else { // q 가 아니면 입력한 값을 보여주고 split 후 Student 인스턴스에 담아 평균과 총점 출력
                System.out.println("[입력] " + studentInfo);
                String[] infoArray = studentInfo.split("/");
                // split 내용물을 가져오는 과정에서 유효한 값이 아닐 경우 예외처리 하면 입력부터 반복이 된다.
                try {
                    String name = infoArray[0];
                    double KoreanScore = Double.parseDouble(infoArray[1]);
                    double EnglishScore = Double.parseDouble(infoArray[2]);
                    double MathScore = Double.parseDouble(infoArray[3]);
                    Student student = new Student(name, KoreanScore, EnglishScore, MathScore);
                    double averageScore = student.average();
                    double totalScore = student.total();

                    System.out.println("평균 : " + averageScore);
                    System.out.println("총점 : " + totalScore);

                    // 유효한 값일 경우 배열에 저장
                    students.add(student);
                } catch (Exception e) {
                    System.out.println("!!! 형식에 맞지 않습니다. 다시 입력하세요.");
                }
            }
        }
        // scanner 종료
        sc.close();
        // 전체 학생 목록 출력
        for (Student student : students) {
            System.out.println("------------");
            System.out.println("이름 : " + student.name);
            System.out.println("평균 : " + student.averageScore);
        }
        // 프로그램 종료
        System.out.println("------------");
        System.out.println("프로그램을 종료합니다.");
    }
}
