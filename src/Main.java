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
        int cur_count;
        int all_count = 0;

        do {

           int rnd_card =  random.nextInt(koloda.cards.size());
           cur_count = koloda.cards.get(rnd_card).point;
           all_count = all_count + cur_count;
           System.out.println(koloda.cards.get(rnd_card).picture+ " "+ koloda.cards.get(rnd_card).suit);
           System.out.println("Текущая карта: "+ cur_count + ", Общий счет: "+all_count);
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
