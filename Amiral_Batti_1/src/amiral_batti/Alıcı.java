
package amiral_batti;

import javax.swing.*;


public class Alıcı {
    public int vurus1,vurus2;
    
    public int x_alıcı(){
         vurus1 = Integer.parseInt(JOptionPane.showInputDialog("Vurmak Istediginiz Yerin X Degerini Giriniz."));
            while(vurus1<0 || vurus1>9){
               vurus1 = Integer.parseInt(JOptionPane.showInputDialog("Vurmak Istediginiz Yerin X Degerini Giriniz."));
            }
        return vurus1;
    }
    public int y_alıcı(){
        vurus2 = Integer.parseInt(JOptionPane.showInputDialog("Vurmak Istediginiz Yerin Y Degerini Giriniz."));
            while(vurus2<0 || vurus2>9){
               vurus1 = Integer.parseInt(JOptionPane.showInputDialog("Vurmak Istediginiz Yerin Y Degerini Giriniz."));
            }
        return vurus2;
    }
}
