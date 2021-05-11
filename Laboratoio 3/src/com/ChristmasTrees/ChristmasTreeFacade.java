package com.ChristmasTrees;

import java.util.*;

public class ChristmasTreeFacade {
    
    public List<String> PinabetTypeTree;
    public List<String> ParsnipTypeTree;
    public List<String> AbiesTypeTree;
    public List<String> HollyTypeTree;
    public List<String> PiceaTypeTree;
    
    public ChristmasTreeFacade() {
        this.PinabetTypeTree = new ArrayList();
        this.ParsnipTypeTree = new ArrayList();
        this.AbiesTypeTree = new ArrayList();
        this.HollyTypeTree = new ArrayList();
        this.PiceaTypeTree = new ArrayList();
        
        this.PinabetTypeTree.add("PINABETE");
        this.ParsnipTypeTree.add("CHIRIBISCO");
        this.AbiesTypeTree.add("BEJUCO");
        this.HollyTypeTree.add("PALO BLANCO");
        this.PiceaTypeTree.add("SAUCE");
    }

    public void placePinabet() {
        iTree pinabet = new PinabetTree();
        
        for(int i=0; i<this.PinabetTypeTree.size(); i++){
            pinabet.place(this.PinabetTypeTree.get(i));
        }
    }

    public void placeParsnip() {
        iTree parsnip = new ChiribiscoTree();
        
        for(int i=0; i<this.ParsnipTypeTree.size(); i++){
            parsnip.place(this.ParsnipTypeTree.get(i));
        }
    }

    public void PlaceAbies() {
        iTree abies = new WillowTree();
        
        for(int i=0; i<this.AbiesTypeTree.size(); i++){
            abies.place(this.AbiesTypeTree.get(i));
        }
    }

    public void PlaceHolly() {
        iTree holly = new WhitestickTree();
        
        for(int i=0; i<this.HollyTypeTree.size(); i++){
            holly.place(this.HollyTypeTree.get(i));
        }
    }

    public void PlacePicea() {
        iTree picea = new BejucoTree();
        
        for(int i=0; i<this.PiceaTypeTree.size(); i++){
            picea.place(this.PiceaTypeTree.get(i));
        }
    }

}