package com.mycompany.redefinicao;

public class Redefinicao {

    public static void main(String[] args) {
       Animal animal = new Cachorro();
       animal.emitirSom();  // Imprime "O cachorro latiu"
       
       animal = new Gato();
       animal.emitirSom();  // Imprime "O gato miou."
       
       animal = new Elefante();
       animal.emitirSom();  // Imprime elefante
    }
}

// crio apenas uma variavel do tipo super classe do tipo animal e 