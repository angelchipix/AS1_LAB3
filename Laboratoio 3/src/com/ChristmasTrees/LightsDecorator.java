package com.ChristmasTrees;

import java.util.*;

public class LightsDecorator extends BombsDecorator {

    int contLights = 0;
    
    public LightsDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETE");
        this.addLights(super.place);
        
        super.place.place("CHIRIBISCO");
        this.addLights(super.place);
        
        super.place.place("BEJUCO");
        this.addLights(super.place);
        
        super.place.place("PALO BLANCO");
        this.addLights(super.place);
        
        super.place.place("SAUCE");
        this.addLights(super.place);
    }

    public void addLights(iTree tree) {
        if(tree instanceof PinabetTree && contLights == 0){
            System.out.println("Decorando Pinabete con luces");
        }
        
        if(tree instanceof ChiribiscoTree && contLights == 0){
            System.out.println("Decorando Chiribisco con luces");
        }
        
        if(tree instanceof WillowTree && contLights == 0){
            System.out.println("Decorando Sauce con luces");
        }
        
        if(tree instanceof WhitestickTree && contLights == 0){
            System.out.println("Decorando Palo Blanco con luces");
        }
        
        if(tree instanceof BejucoTree && contLights == 0){
            System.out.println("Decorando Bejuco con luces");
        }
        
        contLights++;
    }

}