
package exercicio1;


public class IngressoVIP extends Ingresso {
    private float valorAdicional = 5;
    
    public IngressoVIP(float valorAdicional, float valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public IngressoVIP() {
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public String toString() {
        float valorTotal = super.valor + this.valorAdicional;
        return "IngressoVIP R$: " + valorTotal;
        
        //return super.toString() + "IngressoVIP R$: " + valorTotal; exemplo
    }
    
}
