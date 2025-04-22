import java.util.Locale;

public class aula1 {
    public static void main(String[] args) {

        System.out.println("Olá Mundo!");
        System.out.println("Todos Bem?");

        int x = 32; // Int para números inteiros
        double y = 1.85844; // Double para números com poucas casas decimais

        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n",y); // %.2f%n mostrar 2 casas após a virgula
        System.out.printf("%.4f%n", y); // %.4f%n mostrar 4 casas após a virgula
        Locale.setDefault(Locale.US); // Definir a localização do código ( necessita importação )
        System.out.printf("%.2f%n",y);
        System.out.printf("%.4f%n", y);

        // Concatenar com PrintLn
        System.out.println("Valmir " + "Avelar"); // Utilizar o + para concatenação

        // Concatenar com PrintF
        System.out.printf("Valmir = %.2f metros%n", y);

        // Concatenar vários elementos em um mesmo comando de escrita
        String nome = "Valmir";
        int idade = 20;
        double renda = 5000.00;
        System.out.printf("%S tem %d anos e ganha R$ %2f. reias%n", nome, idade, renda);

        // Fixação
        String product1 = "Computer";
        String product2 = "Notebook";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f dol%n", product1, price1);
        System.out.printf("%s, which price is R$ %.2f dol%n", product2, price2);
        System.out.println();
        System.out.printf("%d years old, code %d and gender: %c", age, code, gender);
        System.out.println();
        System.out.printf("Measue with wight decimal places: %f %n", measure);
        System.out.printf("Measue with wight decimal places: %.3f %n", measure);
        System.out.printf("US decimal point: %.3f %n", measure);

    }
}
