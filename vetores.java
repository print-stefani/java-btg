import java.util.Arrays;
import java.text.DecimalFormat;

public class vetores {
    public static void main(String[] args){

      /*  int [] numeros = new int[5];
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;
        numeros [4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }*/

        /*String [] letras = new String[5];
        letras [0] = "A";
        letras [1] = "B";
        letras [2] = "C";
        letras [3] = "D";
        letras [4] = "E";

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }*/

       // String[] letras = {"A", "B", "C", "D", "E", "F"};
       /* for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }*/

        //System.out.println(Arrays.toString(letras));

        int [] numeros = {9, 10, 12, 22, 27, 3};
        int maior = numeros [0], menor = numeros [0];
        float media = 0;
        float resultadomedia = 0;

        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }

        media = media / numeros.length;

        DecimalFormat df = new DecimalFormat("0.00");
        String mediaformatada = df.format(media);

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + mediaformatada);

    }
}
