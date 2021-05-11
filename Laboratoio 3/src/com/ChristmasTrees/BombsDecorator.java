package com.ChristmasTrees;

import java.util.*;

public class BombsDecorator extends ChristmasTree {
    
    int contBombs = 0;
    
    public BombsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETE");
        this.addBombs(super.place);     
        
        super.place.place("CHIRIBISCO");
        this.addBombs(super.place);
        
        super.place.place("SAUCE");
        this.addBombs(super.place);
        
        super.place.place("PALO BLANCO");
        this.addBombs(super.place);
        
        super.place.place("BEJUCO");
        this.addBombs(super.place);
    }
    
    

    public void addBombs(iTree tree) {
        if(tree instanceof PinabetTree && contBombs == 0){
            System.out.println("Decorando Pinabete con bombas");
        }
        
        if(tree instanceof ChiribiscoTree && contBombs == 0){
            System.out.println("Decorando Chiribisco con bombas");
        }
        
        if(tree instanceof WillowTree && contBombs == 0){
            System.out.println("Decorando Sauce con bombas");
        }
        
        if(tree instanceof WhitestickTree && contBombs == 0){
            System.out.println("Decorando Palo Blanco con bombas");
        }
        
        if(tree instanceof BejucoTree && contBombs == 0){
            System.out.println("Decorando Bejuco con bombas");
        }
        contBombs++;
    }

}