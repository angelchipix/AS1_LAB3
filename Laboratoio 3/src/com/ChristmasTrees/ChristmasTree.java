package com.ChristmasTrees;

import java.util.*;

public abstract class ChristmasTree extends ChristmasTreeFacade {

    protected iTree place;
    
    public ChristmasTree(iTree place) {
        this.place = place;
    }

    public void place() {
        this.place.place("PINABETE");
        this.place.place("CHIRIBISCO");
        this.place.place("BEJUCO");
        this.place.place("PALO BLANCO");
        this.place.place("SAUCE");        
    }

}