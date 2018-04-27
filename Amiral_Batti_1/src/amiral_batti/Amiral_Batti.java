package amiral_batti;

import javax.swing.*;


public class Amiral_Batti {
      
    public static void main(String[] args){
        int vurus1,vurus2,c=40,l=0;
        Oyun_Alani Oyun_Alani_1 = new Oyun_Alani();
        Oyun_Alani_1.bos_yapma();
        Player Oyuncu_1 = new Player(17);
        Yapay_Zeka Oyuncu_2 = new Yapay_Zeka(17);
        Oyun_Kontrol Kontrolcu = new Oyun_Kontrol();
        Alıcı Alıcı_1 = new Alıcı();
        Oyuncu_2.gemileri_yerlestir(Oyun_Alani_1.oyun_matrisi2);
        Oyun_Alani_1.gemi_alma();
            for(int i = 0; i<=9; i++){
            System.out.println("");
            for(int j = 0;j<=9;j++){
                System.out.print(Oyun_Alani_1.oyun_matrisi1[i][j]+"  ");
            }
            }
             System.out.println("");
             
                 for(int i = 0; i<=9; i++){
            System.out.println("");
            for(int j = 0;j<=9;j++){
                System.out.print(Oyun_Alani_1.gorunen_matris2[i][j]+"  ");
            }
            }
           
        while(Kontrolcu.can_kontrol(Oyuncu_1.can,Oyuncu_2.can)){
            while(l==0){
                vurus1 = Alıcı_1.x_alıcı();
                vurus2 = Alıcı_1.y_alıcı();       
                 c =  Oyuncu_1.vurus_yap(vurus1, vurus2,Oyun_Alani_1.oyun_matrisi2,Oyun_Alani_1.gorunen_matris2,Oyuncu_2.can);
                 if (c == 40 ){
                   JOptionPane.showMessageDialog(null,"Vurdugunuz Yer Onceden Vurulmus,Tekrar Deneyin","HATA!!",JOptionPane.INFORMATION_MESSAGE);
                 }
                 if (c == Oyuncu_2.can){
                    JOptionPane.showMessageDialog(null,"KARAVANA","Olmadı Be :(",JOptionPane.INFORMATION_MESSAGE);
                    break;
                 }
                 if (c == Oyuncu_2.can-1){
                     Oyuncu_2.can = c;
                     JOptionPane.showMessageDialog(null,"BAŞARILI VURUS!,Tekrar Vuruş Yapabilirsiniz.","HELAL :)",JOptionPane.INFORMATION_MESSAGE);
                 }
            }
        
            System.out.println("");
            System.out.println("");
            System.out.println("Kalan Canınız:"+Oyuncu_1.can);
            for(int o = 0; o<=9; o++){
            System.out.println("");
            for(int p = 0;p<=9;p++){
                System.out.print(Oyun_Alani_1.oyun_matrisi1[o][p]+"  ");
            }
        }
       System.out.println("");      
       System.out.println("");
       System.out.println("Bilgisayarın Kalan Canı:"+Oyuncu_2.can);
               for(int o = 0; o<=9; o++){
            System.out.println("");
            for(int p = 0;p<=9;p++){
                System.out.print(Oyun_Alani_1.gorunen_matris2[o][p]+"  ");
            }
        }
         if(Oyuncu_2.can==0){
          JOptionPane.showMessageDialog(null,"TEBRIKLER OYUNU KAZANDINIZ ","OYUN BITTI :)",JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
         }
         JOptionPane.showMessageDialog(null,"Sıra Bilgisayarda Vurdugunuz Yeri Gormek Icın Matrise Bakın","Matrise Bakın",JOptionPane.INFORMATION_MESSAGE);
        while(l==0){
          c = Oyuncu_2.vurus_yapma(Oyun_Alani_1.oyun_matrisi1,Oyun_Alani_1.gorunen_matris1,Oyuncu_1.can);
          if (c == 40){
              JOptionPane.showMessageDialog(null,"Bilgisayar Vurulmuş Bir Yeri Vurdu, Atışını Tekrarlayacak","HATA!!",JOptionPane.INFORMATION_MESSAGE);
          }
        if (c == Oyuncu_1.can){
            JOptionPane.showMessageDialog(null,"Bilgisayar KARAVANA!!","KARAVANA!!! :)",JOptionPane.INFORMATION_MESSAGE);
            break;
        }
        if(c== Oyuncu_1.can-1){
            Oyuncu_1.can = c;
            JOptionPane.showMessageDialog(null,"Bilgisayar Başarılı Bir Vuruş Yaptı, Atışını Tekrarlıyacak.","HELAL PC :))",JOptionPane.INFORMATION_MESSAGE);
        }
        }
            System.out.println("");
            System.out.println("");
            System.out.println("Kalan Caniniz:"+Oyuncu_1.can);
            for(int o = 0; o<=9; o++){
            System.out.println("");
            for(int p = 0;p<=9;p++){
                System.out.print(Oyun_Alani_1.oyun_matrisi1[o][p]+"  ");
            }
        }
       System.out.println("");     
       System.out.println("");
       System.out.println("Bilgisayarın Kalan Canı:"+Oyuncu_2.can);
               for(int o = 0; o<=9; o++){
            System.out.println("");
            for(int p = 0;p<=9;p++){
                System.out.print(Oyun_Alani_1.gorunen_matris2[o][p]+"  ");
            }
        }
        }
    }
}      
