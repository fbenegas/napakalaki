/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author fran
 */
public class BadConsequence {
    
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(){
    
        text = "";
        levels = 0;
        nVisibleTreasures = 0;
        nHiddenTreasures = 0;
        death = false;
    }
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }

    public BadConsequence(String text, boolean death){
    
        this.text = text;
        this.death = death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
        ArrayList<TreasureKind> tHidden){
        
        this.text = text;
        this.levels = levels;
        specificHiddenTreasures = tHidden;
        specificVisibleTreasures = tVisible;
    }
    
    public String toString(){
    
        return "Consequence = " + text + " levels = " + String.valueOf(levels) 
                + " visible tresaures = " + String.valueOf(nVisibleTreasures) 
                + " hidden tresaures = " + String.valueOf(nHiddenTreasures);
    }
}
