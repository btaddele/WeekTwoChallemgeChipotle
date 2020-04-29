import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chipotle {
    public static void main(String[] args) {

        int count = 0;
        double price;


        String rice[] = {"white", "brown", "none", "all"};
        String meat[] = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie", "meat", "none", "all"};
        String beans[] = {"pinto", "black", "none", "all"};
        String salsa[] = {"mild", "medium", "hot", "none", "all"};
        String veggies[] = {" lettuce", "fajita", "veggies", "none", "all"};
        String cheese[] = {"cheese", "none"};
        String guac [] = {"guac", "none"};
        String queso [] = {"queso", "none"};
        String sour_cream[] = {"sour_cream", "none"};

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);


        int randomNo;
        int itemCount;
        String itempicked,ricePicked,meatPicked,beanpicked, salsapicked,veggiespickede,cheesepicked,guacpicked,quesopicke,sour_creampicked;


       while (count < 25) {
            count++;
            price = 3;
            itemCount = 0;

            randomNo = rnd.nextInt(meat.length);
           if (randomNo < rice.length){
               ricePicked = rice[randomNo];
               itemCount++;
           }else {
               ricePicked = " ";
           }

            if(ricePicked.equalsIgnoreCase("none") || ricePicked.equalsIgnoreCase(" ")){
                price += 0;
            } else {
                price += 0.5;
            }

           randomNo = rnd.nextInt(meat.length);
            if( randomNo < meat.length) {
                meatPicked = meat[randomNo];
                itemCount++;

            }else {
                meatPicked = " ";
            }
            if(meatPicked.equalsIgnoreCase("none") || meatPicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }


            randomNo = rnd.nextInt(meat.length);
            if (randomNo < beans.length) {
                beanpicked = beans[randomNo];
                itemCount++;
            }else {
                beanpicked = " ";
            }
           if(beanpicked.equalsIgnoreCase("none") || beanpicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < salsa.length){
               salsapicked = salsa[randomNo];
               itemCount++;
           }else
               salsapicked = " ";
           if (salsapicked.equalsIgnoreCase("none") || salsapicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < veggies.length) {
               veggiespickede = veggies[randomNo];
               itemCount++;
           }else {
               veggiespickede = " ";
           }
           if(veggiespickede.equalsIgnoreCase("none") || veggiespickede.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < cheese.length) {
               cheesepicked = cheese[randomNo];
               itemCount++;
           }else {
               cheesepicked = " ";
           }
           if(cheesepicked.equalsIgnoreCase("none") || cheesepicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < guac.length) {
               guacpicked = guac[randomNo];
               itemCount++;
           }else {
               guacpicked = " ";
           }

           if(guacpicked.equalsIgnoreCase("none") || guacpicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < queso.length) {
               quesopicke = queso[randomNo];
               itemCount++;
           }else {
               quesopicke = " ";
           }
           if(quesopicke.equalsIgnoreCase("none") || quesopicke.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }

           randomNo = rnd.nextInt(meat.length);
           if (randomNo < sour_cream.length) {
               sour_creampicked = sour_cream[randomNo];
               itemCount++;
           }else {
               sour_creampicked = " ";
           }
           if(sour_creampicked.equalsIgnoreCase("none") || sour_creampicked.equalsIgnoreCase(" ")){
               price += 0;
           } else {
               price += 0.5;
           }
           if (itemCount > 4) {
               System.out.println("Burritos " + count + ":" + ricePicked + ", " + meatPicked +
                       ", " + beanpicked + ", " + salsapicked + ", " + veggiespickede + ", "
                       + cheesepicked + ", " + guacpicked + ", " + quesopicke + "      " + price);
           } else {
               count--;
           }


        }














    }

}
