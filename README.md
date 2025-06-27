# dio-proseletivo

Este repositório contém um mini projeto Java que simula um processo seletivo básico. O programa demonstra etapas comuns de um recrutamento, desde a análise inicial de candidatos até tentativas de contato.

# Estrutura

```
ProSeletivo
├─ README.md
├─ bin
│  └─ candidatura
├─ lib
└─ src
   ├─ App.java
   └─ candidatura
      └─ ProcessoSeletivo.java <-------(EXECUTE ESSE PROGRAMA)
```

# O que o Programa Faz

O programa ProcessoSeletivo.java (localizado em src/candidatura) simula as seguintes etapas:

## Análise de Candidatos

A função analisarCandidato avalia a pretensão salarial de um candidato em relação a um salário base (definido como R$ 2000,00). Ele decide se o candidato deve ser contatado, se uma contraproposta deve ser feita, ou se o processo deve aguardar outros resultados.

## Seleção de Candidatos

A função selecaoCandidatos percorre uma lista de candidatos, gerando uma pretensão salarial aleatória para cada um (entre R$ 1800,00 e R$ 2200,00). O objetivo é selecionar até 5 candidatos cuja pretensão salarial seja menor ou igual ao salário base.

## Impressão de Selecionados

A função imprimiSelecionados exibe a lista dos candidatos que foram selecionados, mostrando-os de duas formas diferentes.

## Tentativas de Contato

A função fazerContato simula o processo de tentar contatar um candidato. Ela tenta ligar para o candidato até 3 vezes. A cada tentativa, há uma chance aleatória de o candidato atender (1 em 3). O programa informa se o contato foi bem-sucedido e em qual tentativa, ou se o candidato não foi atendido após todas as tentativas.