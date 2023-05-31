
package exercicio4;

import java.util.Scanner;


public class Circulo implements Redimensionavel{
    public void redimensionar(double fator){
        
        double raio;
        double area;
        double pi = 3.14;
        
        System.out.println("Escreva o valor do raio");
        Scanner ler = new Scanner(System.in);
        raio = ler.nextFloat();
        
        System.out.println("Escreva o valor da area");
        area = ler.nextFloat();
        
        area = pi * (raio * raio);
        
        System.out.println("A area do circulo é: " + area);
        System.out.println(area);
        ler.close();
    }
}
