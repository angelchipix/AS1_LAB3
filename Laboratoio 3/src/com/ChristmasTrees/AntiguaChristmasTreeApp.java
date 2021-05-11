package com.ChristmasTrees;

import java.util.*;

public class AntiguaChristmasTreeApp {

    public AntiguaChristmasTreeApp() {
    }

    public static void main(String[] args) {
        
        iTree pinabetTree = new PinabetTree();
        ChristmasTree pinabetBombsDecorator = new BombsDecorator(pinabetTree);
        ChristmasTree pinabetLightsDecorator = new LightsDecorator(pinabetTree);
        ChristmasTree pinabetSnowDecorator = new SnowDecorator(pinabetTree);
        pinabetBombsDecorator.place();
        pinabetLightsDecorator.place();
        pinabetSnowDecorator.place();
        System.out.println("\n");
        
        iTree parsnipTree = new ChiribiscoTree();
        ChristmasTree parsnipBombsDecorator = new BombsDecorator(parsnipTree);
        ChristmasTree parsnipLightsDecorator = new LightsDecorator(parsnipTree);
        ChristmasTree parsnipSnowDecorator = new SnowDecorator(parsnipTree);
        parsnipBombsDecorator.place();
        parsnipLightsDecorator.place();
        parsnipSnowDecorator.place();
        System.out.println("\n");
        
        iTree WillowTree = new WillowTree();
        ChristmasTree abiesBombsDecorator = new BombsDecorator(WillowTree);
        ChristmasTree abiesLightsDecorator = new LightsDecorator(WillowTree);
        ChristmasTree abiesSnowDecorator = new SnowDecorator(WillowTree);
        abiesBombsDecorator.place();
        abiesLightsDecorator.place();
        abiesSnowDecorator.place();
        System.out.println("\n");
        
        iTree WhitestickTree = new WhitestickTree();
        ChristmasTree hollyBombsDecorator = new BombsDecorator(WhitestickTree);
        ChristmasTree hollyLightsDecorator = new LightsDecorator(WhitestickTree);
        ChristmasTree hollySnowDecorator = new SnowDecorator(WhitestickTree);
        hollyBombsDecorator.place();
        hollyLightsDecorator.place();
        hollySnowDecorator.place();
        System.out.println("\n");
        
        iTree BejucoTree = new BejucoTree();
        ChristmasTree piceaBombsDecorator = new BombsDecorator(BejucoTree);
        ChristmasTree piceaLightsDecorator = new LightsDecorator(BejucoTree);
        ChristmasTree piceaSnowDecorator = new SnowDecorator(BejucoTree);
        piceaBombsDecorator.place();
        piceaLightsDecorator.place();
        piceaSnowDecorator.place();
        
        
        
        
    }

}