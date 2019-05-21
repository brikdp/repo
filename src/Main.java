import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Koloda koloda = new Koloda();
        koloda.new_cards();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {

           int rnd_card =  random.nextInt(koloda.cards.size());
           System.out.println(koloda.cards.get(rnd_card).picture+ " "+ koloda.cards.get(rnd_card).suit);
           koloda.cards.remove(rnd_card);
           System.out.println("Осталось: " + koloda.cards.size());
           if (koloda.cards.size() ==0){
               koloda.new_cards();
               System.out.println("Новая колода");
           }
        }
        while (scanner.nextLine().equals("y"));


    }


}
