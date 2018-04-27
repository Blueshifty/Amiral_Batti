package amiral_batti;
import java.util.*;

public class Yapay_Zeka{
    public int can;
    
    Yapay_Zeka(int can){
        this.can = can;
    }
    
    Random r = new Random();
    private final int u = r.nextInt(2);
    private final int u2 = r.nextInt(6);
    private final int m = r.nextInt(2)+2;
    private final int m2 = r.nextInt(9);
    private final int f = r.nextInt(4)+6;
    private final int f2 = r.nextInt(3);
    private final int k = r.nextInt(3)+7;
    private final int k2 = r.nextInt(3)+3;
    private final int d = r.nextInt(4)+6;
    private final int d2 = r.nextInt(4)+6;
    
  public void gemileri_yerlestir(char matris[][]){
    for(int i = 0; i<=4;i++){
        matris[u][u2+i]='U';
    }
    for(int i = 0; i <=1;i++){
        matris[m][m2+i]='M';
    }  
    for(int i = 0; i<=2;i++){
        matris[f-i][f2]='F';
    }
    for(int i = 0 ;i<=3;i++){
        matris[k-i][k2]='K';
    }
    for(int i = 0; i<=2;i++){
        matris[d-i][d2]='D';  
    }  
      
  }
    
  public int vurus_yapma(char matris[][],char matris2[][],int can){
   int a = r.nextInt(10);
   int b = r.nextInt(10);
   if(matris2[a][b]!= 'X'){
       return 40;
   }
   if(matris[a][b]=='X'){
       matris2[a][b]='V';
       matris[a][b]='V';
       return can;
   }
      if(matris[a][b]=='F'){
         matris2[a][b]='F';
         matris[a][b]='V';
         return can-1 ;
       }
      if(matris[a][b]=='U'){
         matris2[a][b]='U';
         matris[a][b]='V';
         return can-1;
       }
      if(matris[a][b]=='M'){
         matris2[a][b]='M';
         matris[a][b]='V';
         return can-1;
       }
       if(matris[a][b]=='D'){
         matris2[a][b]='D';
         matris[a][b]='V';
         return can-1;
       }
       if(matris[a][b]=='K'){
          matris2[a][b]='K';
          matris[a][b]='V';
          return can-1;
       }
      return 0;
  }  
    
 
    
    
}
