package amiral_batti;
import javax.swing.*;

public class Oyun_Alani {
   char[][] oyun_matrisi1 = new char[10][10];
   char[][] oyun_matrisi2 = new char[10][10];
   char[][] gorunen_matris1 = new char[10][10];
   char[][] gorunen_matris2 = new char[10][10];
public void bos_yapma(){
    for(int i = 0; i < 10; i++ ){
        for(int j = 0 ; j< 10; j++){
            oyun_matrisi1[i][j] = 'X';
            oyun_matrisi2[i][j] = 'X';
            gorunen_matris1[i][j] = 'X';
            gorunen_matris2[i][j] = 'X';
        }
    }
}       

public boolean gemi_yerlestir(int x, int y,char gemi,int yon,char matris[][],int y_uzunluk){
    
    if(matris[x][y]!='X'){
        return false;
    }
    
    if(yon == 0){
    for(int i = 1; i<=y_uzunluk-1; i++){
        if(matris[x+i][y] != 'X'){
        return false;
    }
    }
    }
    
    if(yon == 1){
        for(int i = 1; i<=y_uzunluk-1; i++){
            if(matris[x][y+i] != 'X'){
                return false;
    }
    }
    }
    
    if(yon == 0){
        for(int i= 0; i<=y_uzunluk-1; i++){
            matris[x+i][y] = gemi; 
        }
        return true;
    }
    
    if(yon == 1){
        for(int i = 0; i<=y_uzunluk-1;i++){
            matris[x][y+i]= gemi;
        }
        return true;
    }
    return true;
}

   public void gemi_alma(){ 
     int x,y;
     int yon;
     yon = Integer.parseInt(JOptionPane.showInputDialog("Ucak Gemisi Icin Yon Degeri Girin(0 Aşağıya 1 Sağa Doğru)"));
     while(yon<0 || yon>1){
         yon = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Yon Degeri 1 veya 0 olmalıdir."));              
     }
     x = Integer.parseInt(JOptionPane.showInputDialog("Ucak Gemisi Icin Koordinat X Degerini Girin"));
     while(x<0||x>9){
         x = Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasında olmalıdır, Tekrar Girin."));
     }
     y = Integer.parseInt(JOptionPane.showInputDialog("Ucak Gemisi Icin Koordiat Y Degerini Girin"));
     while(x<0||x>9){
         y =Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasinda olmalıdır."));
     }
   if(gemi_yerlestir(x, y, 'U', yon,oyun_matrisi1,5))
   {
       JOptionPane.showMessageDialog(null,"Gemi Yerlestirme Basarili","Sonuc",JOptionPane.INFORMATION_MESSAGE);
   }
   yon = Integer.parseInt(JOptionPane.showInputDialog("Mayin Gemisi Icin Yon Degeri Girin(0 Aşağıya 1 Sağa Doğru)"));
     while(yon<0 || yon>1){
         yon = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Yon Degeri 1 veya 0 olmalıdir."));              
     }
     x = Integer.parseInt(JOptionPane.showInputDialog("Mayin Gemisi Icin Koordinat X Degerini Girin"));
     while(x<0||x>9){
         x = Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasında olmalıdır."));
     }
     y = Integer.parseInt(JOptionPane.showInputDialog("Mayin Gemisi Icin Koordiat Y Degerini Girin"));
     while(x<0||x>9){
         y =Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasinda olmalıdır, Tekrar Girin."));
     }
   if(gemi_yerlestir(x, y, 'M', yon,oyun_matrisi1,2))
   {
       JOptionPane.showMessageDialog(null,"Gemi Yerlestirme Basarili","Sonuc",JOptionPane.INFORMATION_MESSAGE);
   }
    yon = Integer.parseInt(JOptionPane.showInputDialog("Fırkateyn Icin Yon Degeri Girin(0 Aşağıya 1 Sağa Doğru)"));
     while(yon<0 || yon>1){
         yon = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Yon Degeri 1 veya 0 olmalıdir."));              
     }
     x = Integer.parseInt(JOptionPane.showInputDialog("Fırkateyn Icin Koordinat X Degerini Girin"));
     while(x<0||x>9){
         x = Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasında olmalıdır."));
     }
     y = Integer.parseInt(JOptionPane.showInputDialog("Fırkateyn Icin Koordiat Y Degerini Girin"));
     while(x<0||x>9){
         y =Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasinda olmalıdır, Tekrar Girin."));
     }
   if(gemi_yerlestir(x, y, 'F', yon,oyun_matrisi1,3))
   {
       JOptionPane.showMessageDialog(null,"Gemi Yerlestirme Basarili","Sonuc",JOptionPane.INFORMATION_MESSAGE);
   }
       yon = Integer.parseInt(JOptionPane.showInputDialog("Kruvazör Icin Yon Degeri Girin(0 Aşağıya 1 Sağa Doğru)"));
     while(yon<0 || yon>1){
         yon = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Yon Degeri 1 veya 0 olmalıdir."));              
     }
     x = Integer.parseInt(JOptionPane.showInputDialog("Kruvazör Icin Koordinat X Degerini Girin"));
     while(x<0||x>9){
         x = Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasında olmalıdır."));
     }
     y = Integer.parseInt(JOptionPane.showInputDialog("Kruvazör Icin Koordiat Y Degerini Girin"));
     while(x<0||x>9){
         y =Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasinda olmalıdır, Tekrar Girin."));
     }
   if(gemi_yerlestir(x, y, 'K', yon,oyun_matrisi1,4))
   {
       JOptionPane.showMessageDialog(null,"Gemi Yerlestirme Basarili","Sonuc",JOptionPane.INFORMATION_MESSAGE);
   }
       yon = Integer.parseInt(JOptionPane.showInputDialog("Deniz Altı Icin Yon Degeri Girin(0 Aşağıya 1 Sağa Doğru)"));
     while(yon<0 || yon>1){
         yon = Integer.parseInt(JOptionPane.showInputDialog
                                 ("Yon Degeri 1 veya 0 olmalıdir."));              
     }
     x = Integer.parseInt(JOptionPane.showInputDialog("Deniz Altı Icin Koordinat X Degerini Girin"));
     while(x<0||x>9){
         x = Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasında olmalıdır."));
     }
     y = Integer.parseInt(JOptionPane.showInputDialog("Deniz Altı Icin Koordiat Y Degerini Girin"));
     while(x<0||x>9){
         y =Integer.parseInt(JOptionPane.showInputDialog("Deger 0 ile 9 arasinda olmalıdır, Tekrar Girin."));
     }
   if(gemi_yerlestir(x, y, 'D', yon,oyun_matrisi1,3))
   {
       JOptionPane.showMessageDialog(null,"Gemi Yerlestirme Basarili","Sonuc",JOptionPane.INFORMATION_MESSAGE);
   }
   
 }     
}





