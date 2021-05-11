package com.ChristmasTrees;

import java.util.*;

public class WhitestickTree implements iTree {

    int fabHolly = 0;
    
    public WhitestickTree() {
    }

    public void place(String typeTree) {
        if(fabHolly == 0) {
            System.out.println("Fabricando árbol de PALO BLANCO");
            fabHolly++;
        }
    }

}