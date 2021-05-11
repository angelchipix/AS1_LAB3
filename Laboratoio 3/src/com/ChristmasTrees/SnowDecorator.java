package com.ChristmasTrees;

import java.util.*;

public class SnowDecorator extends LightsDecorator {

    int contSnow = 0;
    
    public SnowDecorator(iTree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABETE");
        this.addSnow(super.place);
        
        super.place.place("CHIRIBISCO");
        this.addSnow(super.place);
        
        super.place.place("SAUCE");
        this.addSnow(super.place);
        
        super.place.place("PALO BLANCO");
        this.addSnow(super.place);
        
        super.place.place("BEJUCO");
        this.addSnow(super.place);
    }

    public void addSnow(iTree tree) {
        if(tree instanceof PinabetTree && contSnow == 0){
            System.out.println("Decorando Pinabete con nieve");
        }
        
        if(tree instanceof ChiribiscoTree && contSnow == 0){
            System.out.println("Decorando Chiribisco con nieve");
        }
        
        if(tree instanceof WillowTree && contSnow == 0){
            System.out.println("Decorando Sauce con nieve");
        }
        
        if(tree instanceof WhitestickTree && contSnow == 0){
            System.out.println("Decorando Palo Blanco con nieve");
        }
        
        if(tree instanceof BejucoTree && contSnow == 0){
            System.out.println("Decorando Bejuco con nieve");
        }
        contSnow++;
    }

}