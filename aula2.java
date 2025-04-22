import java.util.Scanner;

public class aula2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next(); // Ler uma palavra apartir do teclado
        System.out.println("Você digitou o valor: " + x);

        int y;
        y = sc.nextInt(); // Ler um número inteiro
        System.out.println("Legal digitou o valor: " + y);

        double a;
        a = sc.nextDouble(); // Ler números com pontos flutuantes
        System.out.println("Top! Você digitou um número decimal: " + a );

        char b;
        b = sc.next().charAt(0); // Lê apenas um dado por linha ( O primeiro )
        System.out.println(("Você digitou um caractere: " + b));


        // Ler varios dados na mesma linha separados por espaço
        String c;
        int d;
        double z;
        c = sc.next();
        d = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou vários caracteres: ");
        System.out.println(c);
        System.out.println(d);
        System.out.println(z);


        // Ler um texto até a quebra de linha
        String s1, s2, s3;

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}
