public class main {
    public static void main(String[] args) {
        int minhaIdade = 20;
        String meuNome = "Valmir";

        // Numeros inteiros
        //byte => 8 bits => -128
        //short => 16 bits => -32.768 a 32.767
        //int => 32 bits => -2.147.483.648 a 2.147.483.647
        //long => 64 bits => -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

        // Numeros decimais
        //float => 32 bits => precisão simples
        //double => 64 bits => precisão dupla

        //String => Representar palavras e chaves
        // char => representar um unico caractere => a,b,c,d...
        // boolean => true ou false

        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100000l;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        String str = " ";
        boolean bool = true;

        if (str.isBlank()) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

        System.out.println("Olá Mundo!");


    }
}


