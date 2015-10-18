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
public class Monster {
    
    private String name;
    private int combatLevel;
    
    private final Prize prize;
    private BadConsequence badConsequence;
    
    public Monster(){
    
        name = "";
        combatLevel = 0;
        prize = null;
        badConsequence = null;
    }
    public Monster(String name, int level, BadConsequence bc, Prize price){
    
        this.name = name;
        combatLevel = level;
        badConsequence = bc;
        prize = price;
    }
    
    public String getName(){
            
        return name;
    }
        
    public int getCombatLevel(){
    
        return combatLevel;
    }
    
    public String toString(){
        
        return "Monster = " + name + " combat level = " + Integer.toString(combatLevel)
                + "prize = " + prize.toString() + "bad consequence = " 
                + badConsequence.toString();
    }
}
