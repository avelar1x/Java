public class aula11 {
    public static void main(String[] args){
        String og = "abcde FGHIJ";

        String og1 = og.toLowerCase();
        String og2 = og.toUpperCase();
        String og3 = og.substring(2);// Inicia a string após o caracter definido
        String og4 = og.substring(2, 9); // Define onde inicia e termina a String
        String og5 = og.replace('a', 'x'); // Substitui uma String por outra
        int i = og.indexOf("bc");
        int j = og.lastIndexOf("ij");
        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");

        System.out.println(og);
        System.out.println(og1);
        System.out.println(og2);
        System.out.println(og3);
        System.out.println(og4);
        System.out.println(og5);
        System.out.println(i);
        System.out.println(j);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);


    }
}
