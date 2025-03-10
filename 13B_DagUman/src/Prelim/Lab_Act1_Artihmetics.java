package Prelim;

public class Lab_Act1_Artihmetics {
    public static void main (String [] args){
        
        int x = 11;
        int y = 4;
        int z = 6;
        
        System.out.println(x + " * " + y + " + " + z + " = " + (x * y + z));
        System.out.println( "(" + x + " - " + y + ")" + " % " + z + " = " + ((x - y) % z));
        System.out.println( "(" + x + " + " + y + " + " + z + ")" + " / " + " 3 " + " = " + ((x + y + z)/3));
        System.out.println( x + " * " + z + " - " + "(" + y + " * " + y + ")" + " = " + (x * z - (y * y)));

    }
}