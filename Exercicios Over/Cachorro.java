package com.mycompany.aulaover;

class Cachorro extends Animal {
    @Override
    public void emitirSom(){
      System.out.println("O cachorro latiu: wof wof");
    }
    
    public void mover(){
        System.out.println("O cachorro está correndo");
    }
}
