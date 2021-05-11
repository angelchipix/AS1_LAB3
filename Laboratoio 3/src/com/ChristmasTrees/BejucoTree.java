package com.ChristmasTrees;

import java.util.*;

public class BejucoTree implements iTree {
    
    int fabPicea = 0;
    
    public BejucoTree() {
    }

    public void place(String typeTree) {
        if(fabPicea == 0){
            System.out.println("Fabricando árbol de BEJUCO");
            fabPicea++;
        }
    }

}