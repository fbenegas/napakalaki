/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author fran
 */
public class Prize {
    
    private int level;
    private int treasures;
    
    public Prize(){
    
        level = 0;
        treasures = 0;
    }
    
    public Prize(int treasures, int level){
        
        this.level = level;
        this.treasures = treasures;
    }
    
    public int getTresaures(){
   
        return treasures;
    }
    
    public int getLevel(){
    
        return level;
    }
    
    public String toString(){
        
        return "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(level);   
    }

}
