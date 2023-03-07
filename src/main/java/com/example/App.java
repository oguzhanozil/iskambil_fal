package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<deste> kartlar = olustur();
        int o=0;
        masa masa = new masa(kartlar);
       oyun oyun = new oyun(kartlar);
       oyun.getBoard();
       ArrayList<LinkedList> sonuc = new ArrayList<>(oyun.oyna());
       System.out.println("sonuc: ");
       for (LinkedList<deste> a : sonuc)
       {
        System.out.print(o+": ");
        for (int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i).getSayi() + "  " + a.get(i).getDesen()+ "       |      ");
            
        }
        System.out.println();
        o++;
       }
       System.out.println("Olma ihtimali: " + oyun.hesapla(sonuc));
       
       

    }
    public static ArrayList<deste> olustur() 
    {
        ArrayList<deste> kartlar = new ArrayList<deste>();
        for (int i=1;i<=13;i++)
        {
           deste card1 = new deste(i, "maça");
           deste card2 = new deste(i, "karo");
           deste card3 = new deste(i, "sinek");
           deste card4 = new deste(i, "kupa");
           kartlar.add(card1);
           kartlar.add(card2);
           kartlar.add(card3);
           kartlar.add(card4);
        }
        return kartlar;
        
    }
}
