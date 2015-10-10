/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.aplication;

import cafeteria.util.*;
import java.util.Scanner;

/**
 *
 * @author 20121bsi0040
 */
public class Cafeteria {
    
    public static void escolha() {
        Scanner lerOpcao = new Scanner(System.in);
        //Receitas ou sair
        System.out.println("Digite a opção desejada: \n"
                + "1 - Vizualizar Receita            \n"
                + "2 - Sair                          \n"
                + "3 - Visualizar Promoção do Dia    \n");
        int opcao = lerOpcao.nextInt();
        String escolhido = escolhaOpcoes(opcao);
        while ("escolhe a Receita".equals(escolhido) || "escolhe o Dia".equals(escolhido)) {
            if ("escolhe a Receita".equals(escolhido)){
                System.out.println("Digite a receita desejada: \n"
                                    + "1 - Café Expresso       \n"
                                    + "2 - Café sem cafeína    \n"
                                    + "3 - Cappuccino          \n");
                opcao = lerOpcao.nextInt();
                System.out.println(Cafeteria.escolhaCafe(opcao));
            }
            else{
                System.out.println("Digite o dia da semana que deseja ver a promoção: \n"
                                    + "1 - Domingo \n"
                                    + "2 - Segunda \n"
                                    + "3 - Terça   \n"
                                    + "4 - Quarta  \n"
                                    + "5 - Quinta  \n"
                                    + "6 - Sexta   \n"
                                    + "7 - Sabado  \n");
                opcao = lerOpcao.nextInt();
                System.out.println(Cafeteria.escolheDiaPromo(opcao));
            }
            System.out.println("\n Digite a opção desejada: \n"
                            + "1 - Vizualizar Receita            \n"
                            + "2 - Sair                          \n"
                            + "3 - Visualizar Promoção do Dia    \n");
            opcao = lerOpcao.nextInt();
            escolhido = escolhaOpcoes(opcao);

        }
        //se escolher sair o programa para
        System.out.println(escolhido);
        
    }

    public static String escolhaOpcoes(int opcao) {
        String retorno = "";
        Scanner lerOpcao = new Scanner(System.in);
        //se escolher ver receitas
        if (opcao == 1) {
            retorno = "escolhe a Receita";
        }
        //se escolher sair o programa para
        else if (opcao == 2){
            retorno = " :D Hasta la Vista Baby";
        }
        else if (opcao == 3){
            retorno = "escolhe o Dia";
        }
        else{
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
        return retorno;
    }
    
    public static String escolhaCafe(int opcao) {
        String receita = "";
        if (opcao == 1) {
            receita = FabricaReceitas.receitaCafeExpresso();
        } 
        else if (opcao == 2) {
            receita = FabricaReceitas.receitaCafeSemCafeina();
        } 
        else if (opcao == 3) {
            receita = FabricaReceitas.receitaCafeCappuccino();
        } 
        else {
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
        return receita;
    }

    public static String escolheDiaPromo(int opcao){
        String dia = "";
        
        if (opcao == 1) {
            dia = FabricaPromocoes.promoDomingo().toString();
        } 
        else if (opcao == 2) {
            dia = FabricaPromocoes.promoSegunda().toString();
        }
        else if (opcao == 3) {
            dia = FabricaPromocoes.promoTerça().toString();
        }
        else if (opcao == 4) {
            dia = FabricaPromocoes.promoQuarta().toString();
        }
        else if (opcao == 5) {
            dia = FabricaPromocoes.promoQuinta().toString();
        }
        else if (opcao == 6) {
            dia = FabricaPromocoes.promoSexta().toString();
        }
        else if (opcao == 7) {
            dia = FabricaPromocoes.promoSabado().toString();
        }
        else {
            throw new RuntimeException("Só um palpite: \n" + 
                                       "dando tudo errado, grite. \n"  +
                                       "Ulisses Tavares \n" +
                                       "(Dia da Semana Incorreto)");
        }
        return dia;
    }

}