/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.io.IOException;
import java.util.ArrayList;

public class PruebaNapakalaki {

    
    public static void main(String[] args) throws IOException {
    
        ArrayList<Monster> onstruos = new ArrayList<Monster>();
        ArrayList<Prize> recompensas = new ArrayList<Prize>();
        ArrayList<BadConsequence> malRollo = new ArrayList<BadConsequence>();
        
        System.out.println("Opciones");        
        System.out.println("1. Crear Monstruo");
        System.out.println("2. Crear Recompensa");
        System.out.println("3. Crear Mal Rollo");
        
        int opcion = System.in.read();
        
        switch(opcion){
            
            case 1: break;
            case 2: 
                System.out.print("Tesoros: ");
                int tesoros = System.in.read();
                System.out.print("Niveles: ");
                int niveles = System.in.read();
                Prize p = new Prize(tesoros, niveles);
                recompensas.add(p);
                System.out.println(p.toString());
                break;
            case 3: break;
            default: break;
        }
    }
    
}
