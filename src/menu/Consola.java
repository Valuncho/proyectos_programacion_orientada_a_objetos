package menu;

import java.util.Scanner;

public class Consola {
    private Scanner sc; /*variable*/
    
    public Consola(){
        this.sc = new Scanner(System.in);
    } 
 
    public String leerString (String msg){
        System.out.println(msg);
        return this.sc.next();    
    }
    public int leerint (String msg){
        System.out.println(msg);
        return this.sc.nextInt();
    }
   /* public float leerfloat(String msg){
        System.out.println(msg);
        return this.sc.nextFloat();
    }*/
    /*public boolean leerbooleano(String msg){
        System.out.println(msg);
        return this.sc.nextBoolean();
    }*/
    
    
}
