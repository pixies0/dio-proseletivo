package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }

    public static void analisarCandidato(double salarioPretensao){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretensao)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretensao)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS OUTROS CANDIDATOS");
    }
}