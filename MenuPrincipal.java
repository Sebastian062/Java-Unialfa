/*
 * Autor(es): Sebastião Guerra / Mariana Leandro
 * Curso: Sistemas de Informação
 * Projeto: Menu de Atividades em Java
 * Data: Abril de 2025
 */
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n=== MENU DE ATIVIDADES ===");
            System.out.println("1 - Calcular tempo e consumo de viagem");
            System.out.println("2 - Calcular comissão mensal por categoria");
            System.out.println("3 - Simulador de desconto no produto");
            System.out.println("4 - Calculador de meta mensal de vendas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá seja muito bem vindo!!");
                    System.out.println("===Calculador de Percurso===");
                    System.out.println("Para realizar o cálculo, preencha os dados solicitados:\n");

                    System.out.print("Digite a distância a ser percorrida em Km: ");
                    double distancia = entrada.nextDouble();

                    System.out.print("Digite a velocidade média desejada em Km/h: ");
                    double velocidade = entrada.nextDouble();

                    System.out.print("Digite o consumo médio do veículo em Km/L: ");
                    double consumo = entrada.nextDouble();

                    double tempo = distancia / velocidade;
                    double litros = distancia / consumo;

                    int horas = (int) tempo;
                    int minutos = (int) ((tempo - horas) * 60);

                    System.out.printf("\nA duração aproximada da viagem será de: " + horas + "hora(s) e " + minutos + "minuto(s).\n");
                    System.out.printf("O consumo médio do veículo será de: %.2f litros de combustível.\n", litros);

                    System.out.println("\nBoa Viagem!!");
                    break;

                case 2:
                    System.out.println("Olá seja muito bem vindo!!");
                    System.out.println("===Calculador de Comissão===");
                    System.out.println("Para realizar o cálculo, preencha os dados solicitados:\n");

                    System.out.println("Percentual de ganho da venda por categoria:");
                    System.out.print("Éticos: 1,00% |" + " Genéricos e Similares: 3,50% |\n\n");
                    //System.out.println("Genéricos e Similares: 3,50%");

                    System.out.print("Informe a venda do mês da categoria (Éticos) em R$: ");
                    double vendaEticos = entrada.nextDouble();
                    double comissaoEticos = vendaEticos * 0.01;

                    System.out.print("Informe a venda do mês da categoria (Gen & Sim) em R$: ");
                    double vendaGenericos = entrada.nextDouble();
                    double comissaoGenericos = vendaGenericos * 0.035;

                    double resultado = comissaoEticos + comissaoGenericos;
                    System.out.printf("Sua comissão mensal será de: R$ %,.2f\n\n", resultado);

                    System.out.println("Bom trabalho ;)");
                    break;

                case 3:
                    System.out.println("Olá seja muito bem vindo!!");
                    System.out.println("===Simulador de Descontos===");
                    System.out.println("Para realizar a simulação, preencha os dados solicitados:");

                    System.out.print("\nDigite o valor do produto em R$: ");
                    double valorCheio = entrada.nextDouble();

                    System.out.print("Digite o valor solicitado pelo cliente em R$: ");
                    double valorComDesconto = entrada.nextDouble();

                    double economizado = valorCheio - valorComDesconto;
                    double percentual = (economizado / valorCheio) * 100;

                    System.out.printf("\nCliente economizou no valor de: R$ %,.2f\n", economizado);
                    System.out.printf("Percentual de desconto aplicado no produto: %,.2f", percentual);
                    System.out.println("%\n");

                    System.out.println("Boas vendas!!");
                    break;

                case 4:
                    System.out.println("Olá seja muito bem vindo!!");
                    System.out.println("===Calculador de Meta Mensal===");
                    System.out.print("Para realizar o cálculo, preencha os dados solicitados:\n\n");

                    System.out.print("Informe a sua meta mensal em R$: ");
                    double metaMensal = entrada.nextDouble();

                    System.out.print("Informe o valor parcial atingido de sua meta em R$: ");
                    double metaParcial = entrada.nextDouble();

                    System.out.print("Informe os dias úteis restantes: ");
                    int diasRestantes = entrada.nextInt();

                    double metaRestante = metaMensal - metaParcial;
                    double vendaDiaria = metaRestante / diasRestantes;

                    System.out.printf("\nValor total restante para alcançar a meta mensal é de: R$ %,.2f", metaRestante);
                    System.out.printf("\nVocê precisa vender R$ %,.2f por dia útil restante.\n", vendaDiaria);

                    System.out.println("Lembre-se, não há vitórias sem batalhas!!");
                    break;

                case 5:
                    System.out.println("Encerrando... Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
            entrada.close();
    }
}