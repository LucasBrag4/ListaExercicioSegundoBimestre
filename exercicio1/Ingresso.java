
package exercicio1;


public class Ingresso {
    float valor = 10;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public Ingresso() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return String.format("IngressoBasico R$: " + this.valor) ;
    }
    
}
