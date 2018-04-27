
package amiral_batti;

import javax.swing.JOptionPane;


public class Oyun_Kontrol {
    
    public boolean can_kontrol(int can1,int can2){
     if(can1 == 0){
         JOptionPane.showMessageDialog(null,"Oyunu Kaybettiniz","İyi Denemeydi :)",JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);
         return false;
     }
     if(can2 == 0){
         System.out.println("Oyunu Kazandınız");
         return false;
     }
    return true;
 }
}
