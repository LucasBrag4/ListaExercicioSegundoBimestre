
package exercicio2;


public class Loja {

    
    public static void main(String[] args) {       
        
        relatorio();
    }
    public static void relatorio(){
        Empregado empregado = new Empregado();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
                
     System.out.println(empregado.toString());
     System.out.println(gerente.toString());
     System.out.println(vendedor.toString());
    }
    
}
