package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato : candidatos) {
            fazerContato(candidato);
        }
    }

    static void fazerContato(String candidato){
        int tentativas = 1;
        boolean tentarNovamente = true;
        boolean atendido = false;

        do {
            atendido = atender();
            tentarNovamente = !atendido;

            if(tentarNovamente) {
                System.out.println(tentativas + "ª TENTATIVA SEM SUCESSO");
                tentativas++;
            }else{
                System.out.println("CONTATO RAELIZADO COM SUCESSO");
            }

        } while (tentarNovamente && tentativas < 3);

        if(atendido)
            System.out.println("Candidato " + candidato + " atendido com sucesso na " + tentativas + "ª tentativa.\n");
        else
            System.out.println("Candidato " + candidato + " não foi atendido após " + tentativas + " tentativas.\n");
    }

    // Função auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimiSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Candidatos Selecionados:");
        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("#" + (i + 1) + "-" + candidatos[i]);
        }

        System.out.println("\nForma abreviada");
        int indice = 1;
        for (String candidato : candidatos) {
            System.out.println("#" + indice + "-" + candidato);
            indice++;
        }
    }

    // Função auxiliar para gerar um salário de pretensão aleatório
    static double pretensaoSalarial() {
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

        while (selecionados < 5 && atual < candidatos.length) {
            String candidato = candidatos[atual];
            System.out.println("Candidato: " + candidato);

            double salarioPretensao = pretensaoSalarial();
            System.out.println("Salario Pretensao: " + String.format("%.2f", salarioPretensao));

            if (salarioBase >= salarioPretensao) {
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