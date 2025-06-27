package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    // Função auxiliar para gerar um salário de pretensão aleatório
    static double pretensaoSalarial(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
            "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"
        };

        int selecionados = 0;
        int atual = 0;
        double salarioBase = 2000.0;

        while(selecionados < 5 && atual < candidatos.length) {
            String candidato = candidatos[atual];
            System.out.println("Candidato: " + candidato);

            double salarioPretensao = pretensaoSalarial();
            System.out.println("Salario Pretensao: " + String.format("%.2f", salarioPretensao));

            if(salarioBase >= salarioPretensao){
                selecionados++;
                System.out.println("Candidato Selecionado: " + candidato);
            }

            atual++;
        }
    }

    static void analisarCandidato(double salarioPretensao) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretensao)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretensao)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS OUTROS CANDIDATOS");
    }
}