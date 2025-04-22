import java.util.Scanner;

public class aula12 {
    public static void main(String[] args) {
        double x = Math.sqrt(9);

        Scanner sc = new Scanner(System.in);

        System.out.println(x);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

     sc.close();
    }
    
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}
