package UltraEmojiCombat;
public class UltraEmojiCombat {
    public static void main (String[] args){
    Lutador l [] = new Lutador[6]; 
    l[0] = new Lutador ("Pretty Boy","Franca", 31 , 1.75f , 68.9f , 11 , 2 ,1 );
    l[1] = new Lutador ("Pretty ","Franca", 31 , 1.75f , 68.9f , 12 , 2 ,1 );
    l[2] = new Lutador ("Arhtur ","Brasil", 19 , 1.72f , 68.9f , 12 , 2 ,1 );
    l[3] = new Lutador ("Vitoria ","China", 18 , 1.65f , 68.9f , 12 , 2 ,1 );
    Luta UEC01 = new Luta ();
    UEC01.marcarLuta(l[0],l[2]); 
    UEC01.lutar();
    }
}
