package sample;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //unos
        Scanner unesi= new Scanner(System.in);
        String cijelaRecenica;

        cijelaRecenica=unesi.nextLine();
        String najdruzRijec="";
        for(String rijec : cijelaRecenica.split(" ") ){
            //rasponska prolazi kroz svaku rijec
            if(rijec.length() > najdruzRijec.length())
                najdruzRijec = rijec;
        }
        String nova;
        nova=cijelaRecenica.replaceAll(najdruzRijec,(najdruzRijec.toUpperCase()));
        //ispis najdruze rijeci
        System.out.println(nova);
    }
}
