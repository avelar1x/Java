package course4.application;

import course4.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0 ){
            System.out.println("Reprovado");
            System.out.printf("Missing %.2f Points%n", student.misingPoints());
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }

}
