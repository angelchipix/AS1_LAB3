package com.ChristmasTrees;

import java.util.*;

public class ChiribiscoTree implements iTree {

    int fabParsnip = 0;
    
    public ChiribiscoTree() {
    }

    public void place(String typeTree) {
        if(fabParsnip == 0){
            System.out.println("Fabricando árbol de tipo CHIRIBISCO");
            fabParsnip++;
        }
    }

}