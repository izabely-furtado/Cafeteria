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
                + "1 - Vizualizar Receita \n"
                + "2 - Sair \n");
        int opcao = lerOpcao.nextInt();
        String escolhido = escolhaOpcoes(opcao);
        while ("escolhe a Receita".equals(escolhido)) {
            System.out.println("Digite a receita desejada: \n"
                    + "1 - Café Expresso \n"
                    + "2 - Café sem cafeína \n"
                    + "3 - Cappuccino \n");
            opcao = lerOpcao.nextInt();
            System.out.println(Cafeteria.escolhaCafe(opcao));
            System.out.println("\n Digite a opção desejada: \n"
                + "1 - Vizualizar Receita \n"
                + "2 - Sair \n");
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

}
