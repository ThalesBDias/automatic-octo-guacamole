package Exe2;

public class ClienteFisico extends Cliente {
    private int idade;
    private int salario;
    
    public ClienteFisico(String nome,int idade,int salario){
        super(nome);
        this.idade = idade;
        this.salario = salario;
    }

    

    @Override
    public double getMensalidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMensalidade'");
    }

    
}
