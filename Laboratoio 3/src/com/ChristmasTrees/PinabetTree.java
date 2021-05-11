package com.ChristmasTrees;

import java.util.*;

public class PinabetTree implements iTree {
    
    int fabPinabeto = 0;
    
    public PinabetTree() {
    }

    public void place(String typeTree) {
        if(fabPinabeto == 0){
            System.out.println("Fabricando árbol de tipo PINABETE");
            fabPinabeto++;
        }
        
    }

}