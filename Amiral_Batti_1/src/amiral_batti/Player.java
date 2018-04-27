
package amiral_batti;


public class Player {
   public int can;
   Player(int can){
       this.can= can;
   }
   public int  vurus_yap(int x,int y,char matris[][],char matris2[][],int can){
       if(matris2[x][y]!= 'X'){
           return 40;
       }
       if(matris[x][y]=='X'){
           matris2[x][y]='V';
           return can;
       }
       if(matris[x][y]=='F'){
           matris2[x][y]='F';
           return can-1 ;
       }
       if(matris[x][y]=='U'){
           matris2[x][y]='U';
           return can-1;
       }
       if(matris[x][y]=='M'){
           matris2[x][y]='M';
           return can-1;
       }
       if(matris[x][y]=='D'){
           matris2[x][y]='D';
           return can-1;
       }
       if(matris[x][y]=='K'){
           matris2[x][y]='K';
           return can-1;
       }
      return 0;
   }
    
    
    
    
    
}
