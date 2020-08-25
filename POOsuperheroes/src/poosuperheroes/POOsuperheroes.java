
package poosuperheroes;


public class POOsuperheroes {


    public static void main(String[] args) {
 
        superheroes S, S1;
        
        S = new superheroes();
        S1 = new superheroes();
        
        
        System.out.println("El Superheroe vuela:" + S.vuela );
        System.out.println("El Superheroe tiene Vision nuclear:" + S.visionnuclear );
        
        System.out.println("El Superheroe Pirincho vuela:" + S1.vuela );
        System.out.println("El Superheroe Pirincho tiene Vision nuclear:" + S1.visionnuclear );
        
    }
    
}
