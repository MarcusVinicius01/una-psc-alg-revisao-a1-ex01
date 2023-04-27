import java.util.Scanner;

public class ExercicioUmRevisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, respostasUm, respostaDois, respostaTres, respostaQuatro;
        int idade, tentativas = 0, tentativas1 = 0, tentativas2 = 0, tentativas3 = 0;
        double  porcentagem1 = 0, porcentagem2 = 0, porcentagem3 = 0, porcentagem4 = 0, porcentagemFinal;

        System.out.println("\nPrograma para identificação de possíveis expansões virais no Brasil vindas do exterior.");
    
        System.out.println("\nInforme seu nome: ");
        nome = sc.nextLine();
        System.out.println("\nInforme sua idade: ");
        idade = sc.nextInt();

        System.out.println("\nOk " + nome + ". Agora responda as perguntas abaixo com 'sim' ou 'nao'.");

        do {  
             System.out.println("\nSeu cartão de vacina está em dia?");
             respostasUm = sc.nextLine();
             tentativas++;
             
             if (!respostasUm.equals("sim") && !respostasUm.equals("nao")) {
                System.out.println("\nResposta inválida! Responda apenas com 'sim' ou 'nao'.");
            }
            }  while (!respostasUm.equals("sim") && !respostasUm.equals("nao") && tentativas< 3);
              if (tentativas==3 && !respostasUm.equals("sim") && !respostasUm.equals("nao")) {
                System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                System.exit(0);
            }  
              else {}

        do {
            System.out.println("\nTeve algum dos sintomas como: Dor de cabeça, febre, náusea, dor articular e gripe recentemente? ");
            respostaDois = sc.nextLine();
            tentativas1++;
            if (!respostaDois.equals("sim") && !respostaDois.equals("nao")) {
                System.out.println("\nResposta inválida! Responda apenas com 'sim' ou 'nao'.");
            }
            } while (!respostaDois.equals("sim") && !respostaDois.equals("nao") && tentativas1 < 3);
              if (tentativas1==3 && !respostaDois.equals("sim") && !respostaDois.equals("nao")) {
                System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                System.exit(0);
            } 
              else {}

        do {
             System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias? ");
             respostaTres = sc.nextLine();
             tentativas2++;
             if (!respostaTres.equals("sim") && !respostaTres.equals("nao")) {
                System.out.println("\nResposta inválida! Responda apenas com 'sim' ou 'nao'.");
            }
            }   while (!respostaTres.equals("sim") && !respostaTres.equals("nao") && tentativas2 < 3);
              if (tentativas2==3 && !respostaTres.equals("sim") && !respostaTres.equals("nao")) {
                System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                System.exit(0);
            } 
              else {}

        do {
             System.out.println("\nEstá retornando de viagem realizada no exterior? ");
             respostaQuatro = sc.nextLine();
             tentativas3++;
             if (!respostaQuatro.equals("sim") && !respostaQuatro.equals("nao")) {
                System.out.println("\nResposta inválida! Responda apenas com 'sim' ou 'nao'.");
             }
             }  while (!respostaQuatro.equals("sim") && !respostaQuatro.equals("nao") && tentativas3 < 3);
              if (tentativas3==3 && !respostaQuatro.equals("sim") && !respostaQuatro.equals("nao")) {
                System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                System.exit(0);
             }  
              else {}

            if (respostasUm.equals("nao")) {
                porcentagem1 = 10;
            }
            else {
                porcentagem1 = 0;
            }

            if (respostaDois.equals("sim")) {
                porcentagem2 = 30;
            }
            else {
                porcentagem2 = 0;
            }

            if (respostaTres.equals("sim")) {
                porcentagem3 = 30;
            }
            else {
                porcentagem3 = 0;
            }

            if (respostaQuatro.equals("sim")) {
                porcentagem4 = 30;
            }
            else {
                porcentagem4 = 0;
            }
    
        porcentagemFinal = porcentagem1 + porcentagem2 + porcentagem3 +porcentagem4;

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);

        if (respostasUm.equals("sim")) {
            System.out.println("\n" +nome+ "ESTÁ com o cartão de vacina em dia");
        }
        else {
            System.out.println("\n" +nome+ "  NÃO ESTÁ com o cartão de vacina em dia");
        }
        if (respostaDois.equals("sim")) {
            System.out.println("\n" +nome+ " TEVE sintomas recentemente");
        }
        else {
            System.out.println("\n" +nome+ " NÃO TEVE sintomas recentemente");
        }
        if (respostaTres.equals("sim")) {
            System.out.println("\n" +nome+ " TEVE contato com pessoas infectadas");
        }
        else {
            System.out.println("\n" +nome+ " NÃO TEVE contato com pessoas infectadas");
        }
        if (respostaQuatro.equals("sim")) {
            System.out.println("\n" +nome+ " ESTÁ retornando de viagem");
        }
        else {
            System.out.println("\n" +nome+ " NÃO ESTÁ retornando de viagem");
        }

        System.out.println("\n" + nome + " tem " +porcentagemFinal+ "% de estar infectado");
        

        if (porcentagemFinal <= 30 && respostaQuatro.equals("nao")) {
            System.out.println("\nPaciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        }
        else if (porcentagemFinal <= 60 && respostaQuatro.equals("nao")) {
            System.out.println("\nPaciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        }
        else if (porcentagemFinal >= 90 && respostaQuatro.equals("nao")) {
            System.out.println("\nPaciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
        }
        else if (respostaQuatro.equals("sim")) {
            System.out.println("\nVocê ficará sob observação por 05 dias.");
        }
    }
}