package com.example;
import java.lang.Math;
import java.util.ArrayList;
import java.util.LinkedList;

public class masa {
    private static ArrayList<deste> kartlar;
    masa(ArrayList<deste> kartlar)
    {
        this.kartlar=kartlar;
    }
    
    public static void getDeck()
    {
       
        for (int j=0;j<52;j++)
        {
            System.out.print(kartlar.get(j).getSayi()+" "+kartlar.get(j).getDesen()+" | ");
            if ((j+1)%4==0)
            {
                System.out.println();
            }
        }
       
    }
   
    public static ArrayList<LinkedList> masaOlustur()
    {
        ArrayList<deste> cards = new ArrayList<>(kartlar);
        ArrayList<LinkedList> onBoard = new ArrayList<>();
        for (int i=0;i<13;i++)
        {
            LinkedList<deste> kart =new LinkedList<>();
            for (int j=0;j<3;j++)
            {
                int randomNumber = (int)(Math.random()*cards.size());
                kart.add(cards.get(randomNumber));
                cards.remove(randomNumber);         
            }
            onBoard.add(kart);
        }
        ArrayList<deste> randomCards = new ArrayList<>();
        for(int i=0;i<13;i++)
        {
            int randomNumber = (int)(Math.random()*cards.size());        
            randomCards.add(cards.get(randomNumber));
            cards.remove(randomNumber);
        }
        LinkedList<deste> onHand = new LinkedList<>(randomCards);
        onBoard.add(onHand);
        return onBoard;
    } 
}
