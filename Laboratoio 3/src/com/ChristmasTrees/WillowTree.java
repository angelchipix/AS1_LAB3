package com.ChristmasTrees;

import java.util.*;

public class WillowTree implements iTree {
    
    int fabAbies = 0;
    
    public WillowTree() {
    }

    public void place(String typeTree) {
        if(fabAbies == 0){
            System.out.println("Fabricando árbol de tipo SAUCE");
            fabAbies++;
        }
    }

}