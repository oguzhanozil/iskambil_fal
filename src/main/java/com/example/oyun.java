package com.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class oyun extends masa
{
    public static ArrayList<LinkedList> onGame;
    public oyun(ArrayList<deste> onGame)
    {
        super(onGame);
        this.onGame=masaOlustur();
    }
    public static void getBoard()
    {
       ArrayList<LinkedList> board = masaOlustur();
       for (LinkedList<deste> str : board)
       {
            for (int i=0;i<str.size();i++)
            {
                System.out.print(str.get(i).getSayi()+" "+str.get(i).getDesen()+ "|");
            }
            
        
       }
       System.out.println();
    }
    public static ArrayList<LinkedList> oyna() 
    {   int elde=0;
        do
        {
            for (int i=0;i<8;i++)
            {
                if (onGame.get(i).size()==0)
                {
                    continue;
                }
                System.out.print(i+". card:  "+((deste) onGame.get(i).get(0)).getSayi()+" | "
                +((deste) onGame.get(i).get(0)).getDesen());
                if(onGame.get(i).size()>=2 && ((deste) onGame.get(i).get(0)).getSayi()
                == ((deste) onGame.get(i).get(1)).getSayi())
                {
                    System.out.print("  | Sayi ust uste !");
                }
                System.out.println();
            }
            if (onGame.get(0).size() == 0 && onGame.get(1).size()==0)
            {
                if(onGame.get(8).size()!=0)
                {
                System.out.println("8. card: "+((deste) onGame.get(8).get(0)).getSayi()
                +" | "+((deste) onGame.get(8).get(0)).getDesen());
                if(onGame.get(8).size() >=2 &&
                ((deste) onGame.get(8).get(0)).getSayi()== ((deste) onGame.get(8).get(1)).getSayi())
                    {
                        System.out.println("  | Sayi ust uste !");
                    }
                }
                

            }
            if (onGame.get(2).size() == 0 && onGame.get(3).size()==0)
            {
                if(onGame.get(9).size()!=0)
                {
                System.out.println("9. card: "+((deste) onGame.get(9).get(0)).getSayi()
                +" | "+((deste) onGame.get(9).get(0)).getDesen());
                if(onGame.get(9).size() >=2 &&
                ((deste) onGame.get(9).get(0)).getSayi()== ((deste) onGame.get(9).get(1)).getSayi())
                    {
                        System.out.println("  | Sayi ust uste !");
                    }
                }
            }
            if (onGame.get(4).size() == 0 && onGame.get(5).size()==0)
            {
                if(onGame.get(10).size()!=0)
                {
                System.out.println("10. card: "+((deste) onGame.get(10).get(0)).getSayi()
                +" | "+((deste) onGame.get(10).get(0)).getDesen());
                if(onGame.get(10).size() >=2 &&
                ((deste) onGame.get(10).get(0)).getSayi()== ((deste) onGame.get(10).get(1)).getSayi())
                    {
                        System.out.println("  | Sayi ust uste !");
                    }
                }
            }
            if (onGame.get(6).size() == 0 && onGame.get(7).size()==0)
            {
                if(onGame.get(11).size()!=0)
                {
                System.out.println("11. card: "+((deste) onGame.get(11).get(0)).getSayi()
                +" | "+((deste) onGame.get(11).get(0)).getDesen());
                if(onGame.get(11).size() >=2 &&
                ((deste) onGame.get(11).get(0)).getSayi()== ((deste) onGame.get(11).get(1)).getSayi())
                    {
                        System.out.println("  | Sayi ust uste !");
                    }
                }
            }

            if (onGame.get(8).size()==0 && onGame.get(9).size()==0 &&
             onGame.get(10).size()==0 && onGame.get(11).size()==0 )
            {
                System.out.println("12. card:  "+ ((deste) onGame.get(12).get(0)).getSayi()+" | "
                +((deste) onGame.get(12).get(0)).getDesen());
            }
            
            String check="+";
            if (onGame.get(13).size()!=0)
            {
                do{
                    if (elde>=onGame.get(13).size())
                {
                    elde = 0;
                }
                System.out.print("elindeki kart: "+((deste) onGame.get(13).get(elde)).getSayi()+ " | " 
                +((deste) onGame.get(13).get(elde)).getDesen() + " ----- degistirmek icin + giriniz: ");
                
                if (elde+1<onGame.get(13).size()&& ((deste) onGame.get(13).get(elde)).getSayi()
                == ((deste) onGame.get(13).get(elde+1)).getSayi())
                {
                    System.out.print("  Bir sonraki sayi da ayni !");
                }
                else if(elde+1==onGame.get(13).size() && ((deste) onGame.get(13).get(elde)).getSayi()
                == ((deste) onGame.get(13).get(0)).getSayi())
                {
                    System.out.print("  Bir sonraki sayi da ayni !");   
                }
                Scanner arti = new Scanner(System.in);
                check = arti.next();
                
                if (check.equals("+"))
                {
                    elde++;
                }

                if (elde>=onGame.get(13).size())
                {
                    elde = 0;
                }
            }while(check.equals("+"));
            }
            else if(onGame.get(13).size()==0)
            {
                System.out.println("Elinde kart kalmadi bu arada btw :))");
            }
            int sil1;
            int sil2;
           boolean deleted=true;
           do{
           do{
                do
                {
                    Scanner delete1 = new Scanner(System.in);
                    while (!delete1.hasNextInt()) delete1.next();
                    sil1=delete1.nextInt();
                    if (sil1>13 || sil1<0)
                    {
                        System.out.println("THE NUMBER MUST BE BETWEEN 1-13 !");
                    }

                }while (sil1<0 || sil1>13);
                
                
                if (onGame.get(sil1).size() == 0)
                {
                    System.out.println("please enter another number for delete1 !");
                }
                

           }while(onGame.get(sil1).size() == 0);
           do{

            do
            {
                Scanner delete2 = new Scanner(System.in);
                while (!delete2.hasNextInt()) delete2.next();
                sil2=delete2.nextInt();
                if (sil2>13 || sil2<0)
                {
                    System.out.println("THE NUMBER MUST BE BETWEEN 1-13 !");
                }

            }while (sil2<0 || sil2>13);
                if (onGame.get(sil2).size() == 0)
                {
                    System.out.println("please enter another number for delete2 !");
                }
           }while(onGame.get(sil2).size() == 0);
           if (sil1==sil2 && onGame.get(sil1).size() >=2 && ((deste) onGame.get(sil1).get(0)).getSayi() 
           ==((deste) onGame.get(sil2).get(1)).getSayi())
           {
            onGame.get(sil1).remove(0);
            onGame.get(sil2).remove(0);
            deleted=false;
            continue;
           }
           else if(sil1!=13 &&  sil2!=13 && sil1!= sil2 &&((deste) onGame.get(sil1).get(0)).getSayi() 
           ==((deste) onGame.get(sil2).get(0)).getSayi())
           {
            onGame.get(sil1).remove(0);
            onGame.get(sil2).remove(0);
            deleted=false;
            continue;
           }
           else if(sil1==13 && sil2!=13 &&((deste) onGame.get(sil1).get(elde)).getSayi() 
           ==((deste) onGame.get(sil2).get(0)).getSayi())
           {
            onGame.get(sil1).remove(elde);
            onGame.get(sil2).remove(0);
            deleted=false;
            continue;
           }
           else if(sil2==13 && sil1!=13 && ((deste) onGame.get(sil2).get(elde)).getSayi() 
           ==((deste) onGame.get(sil1).get(0)).getSayi())
           {
            onGame.get(sil2).remove(elde);
            onGame.get(sil1).remove(0);
            deleted=false;
            continue;
           }
           else if(sil1==13 && sil2==13)
           {
            if (onGame.get(sil1).get(elde)==onGame.get(sil1).getLast() && ((deste) onGame.get(sil1).get(elde)).getSayi()==
            ((deste) onGame.get(sil1).get(0)).getSayi())
            {
                onGame.get(sil1).remove(elde);
                onGame.get(sil2).remove(0);
                deleted=false;
                continue;
            }
            else if (((deste) onGame.get(sil2).get(elde)).getSayi() 
            ==((deste) onGame.get(sil1).get(elde+1)).getSayi())
            {
                onGame.get(sil1).remove(elde);
                onGame.get(sil2).remove(elde);
                deleted=false;
                continue;
                
            }
                
           }
           else 
           {
            System.out.println("Girdiğiniz iki yerdeki sayilarin degerleri ayni degildir !");
            break;
           }
        }while(deleted);
            
            
        }while (devam(onGame));  
        return onGame;
    }
    public static boolean devam(ArrayList <LinkedList> control)
    {
        LinkedList<deste> onuc = new LinkedList<>(control.get(13));
        int res=0;
        boolean result = false;
        for (int i = 0;i < control.size();i++)
        {
            if (control.get(i).size()==0)
            {
                continue;
            }
            if (i==8 && (control.get(0).size()!=0 || control.get(1).size()!=0))
            {
                continue;
            }
            else if (i==9 && (control.get(2).size()!=0 || control.get(3).size()!=0))
            {
                continue;
            }
            else if (i==10 && (control.get(4).size()!=0 || control.get(5).size()!=0))
            {
                continue;
            }
            else if (i==11 && (control.get(6).size()!=0 || control.get(7).size()!=0))
            {
                continue;
            }
            else if (i==12 && (control.get(8).size()!=0 || control.get(9).size()!=0 || 
            control.get(10).size()!=0 || control.get(11).size()!=0  ))
            {
                continue;
            }
            else if (i==13 && onuc.size()>=2)
            {
                for (int m=0; m<onuc.size()-1;m++)
                {
                        if (onuc.get(m).getSayi()==onuc.get(m+1).getSayi())
                        {
                            result =true;
                            return result;
                        }
                        if (onuc.get(0).getSayi()==onuc.getLast().getSayi())
                        {
                            result =true;
                            return result;
                        }           
                }
            }

            if (i!=13)
            {
                res = ((deste) control.get(i).get(0)).getSayi();
                if ( control.get(i).size()>=2)
                {
                    if (((deste) control.get(i).get(1)).getSayi()== res )
                     {
                        result=true;
                        return result;
                     }
                }
                
            }
            
            
            for (int j = i+1;j < control.size();j++)
            {
                if (control.get(j).size()==0)
                {
                    continue;
                }
                if (j==8 && (control.get(0).size()!=0 || control.get(1).size()!=0))
                {
                    continue;
                }
                else if (j==9 && (control.get(2).size()!=0 || control.get(3).size()!=0))
                {
                    continue;
                }
                else if (j==10 && (control.get(4).size()!=0 || control.get(5).size()!=0))
                {
                    continue;
                }
                else if (j==11 && (control.get(6).size()!=0 || control.get(7).size()!=0))
                {
                    continue;
                } 
                else if (j==12 && (control.get(8).size()!=0 || control.get(9).size()!=0 || 
                control.get(10).size()!=0 || control.get(11).size()!=0  ))
            {
                continue;
            }
                if (res==((deste) control.get(j).get(0)).getSayi() && j!=13)
                {
                    result = true;
                    return result;
                }
                else if (j==13 && control.get(j).size()!=0 && i<13)
                {
                    for (deste a : onuc)
                    {
                        if (res == a.getSayi())
                        {
                            result=true;
                            return result;
                        }
                    }
                }
            }
            
        }
        return result;
    }
    public static int hesapla(ArrayList<LinkedList> sonuc)
    {
        int ihtimal=0;
        for (LinkedList<deste> a : sonuc)
        {
         ihtimal = ihtimal + a.size();
        }
        ihtimal=((52-ihtimal)/2)*3;
        for (int i=8;i<12;i++)
        {
            if (sonuc.get(i).size()==0)
            {
                ihtimal=ihtimal+4;
            }
        }
        if (sonuc.get(12).size()==0)
        {
            ihtimal=ihtimal+6;
        }
       
        return ihtimal;
    }
}
