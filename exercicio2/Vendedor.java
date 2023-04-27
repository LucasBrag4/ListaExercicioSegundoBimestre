
package exercicio2;

public class Vendedor extends Empregado {
    private float percentualComissao = 5;
    private float totalVendido = 150;
    private float totalGanhoComissao;
    private float totalSalario;

    public Vendedor() {
    }
    

    public Vendedor(String nome, float salario, float percentualComissao, float totalVendido, float totalGanhoComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
        this.totalVendido = totalVendido;
        this.totalGanhoComissao = totalGanhoComissao;
    }
    
    public float calcularSalario(){
        float totalGanhoComissao = totalVendido * percentualComissao / 100; 
        totalSalario = salario + totalGanhoComissao;
        return totalSalario;
        
    }

    @Override
    public String toString() {
        return "Vendedor{" + getNome() + "Salario base: " + salario +
                "Salario com comissao :" + calcularSalario() + "percentualComissao=" + percentualComissao + 
                "totalVendido=" + "}";
    }
    
}
