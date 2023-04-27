
package exercicio2;


public class Empregado {
    private String nome = "Carlos";
    protected float salario = 2300;

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Empregado() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
