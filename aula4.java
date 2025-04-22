import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas são?");
        hora = sc.nextInt();

        if ( hora < 12) {
            System.out.println("Bom dia!");
        }else if (hora <= 18) {
            System.out.println("Bom tarde!");
        }else {
            System.out.println("Bom noite!");
        }


        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.00;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        double preco = 34.5;
        double desc = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desc);
        sc.close();
    }
}
