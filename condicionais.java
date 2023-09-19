
public class condicionais {
    public static void main (String[] args) {

      /*  if (nota >= 70){
            System.out.println("Aluno aprovado!");
        } else{
            System.out.println("Não aprovado...");
        }*/

        int nota = 100;
        String graduacao;

        if (nota >= 80){
            graduacao = "A";

        } else if (nota < 80 && nota >= 70){
            graduacao = "B";

        } else if (nota < 70 && nota >= 60){
            graduacao = "C";

        } else if (nota < 60 && nota >= 0){
            graduacao = "D";

        } else {
            graduacao = "";
        }

        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno não Aprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }


    }

}