import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringdatas {

    public static void main (String[] args){
        // fazer olá nome. Hoje é dia da semana, BOM DIA

        /*String nome = "Stefani";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nome2 = "stefani";
        System.out.println(nome.equalsIgnoreCase(nome2));*/

        String nome = "Stefani";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diasemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diasemana,saudacao.toUpperCase());

    }
}
