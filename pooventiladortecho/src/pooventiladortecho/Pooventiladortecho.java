
package pooventiladortecho;


public class Pooventiladortecho {


    public static void main(String[] args) {
 
        ventiladortecho v1, v2;
        
        v1 = new ventiladortecho ();
        v2 = new ventiladortecho ();
                
        v1.aspas = 5;
        v1.color = "Marron";
        v1.velocidad = 400;
        
        
        v2.aspas = 4;
        v2.color = "Gris";
        v2.velocidad = 800;
        
        System.out.println( "Este modelo tiene: " + v1.aspas + " aspas");
        System.out.println("El color es " + v1.color);
        System.out.println("Tiene una velocidad " + v1.velocidad + " RPM");
               
        System.out.println( "Este modelo tiene: " + v2.aspas + " aspas");
        System.out.println("El color es " + v2.color);
        System.out.println("Tiene una velocidad " + v2.velocidad + " RPM");
        
        
    }
    
}
