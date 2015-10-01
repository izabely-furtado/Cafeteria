/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.cafes;

import cafeteria.util.FabricaIngredientes;
import cafeteria.cdp.*;

/**
 *
 * @author 20121bsi0040
 */
public abstract class FabricaCafe implements FabricaIngredientes{
    private float preco;
    private Agua agua;
    
    //todo cafe tem agua
    FabricaCafe(float preco){
        //setando o preço
        this.setPreco(preco);
        //colocando os ingredientes
        this.agua = this.criarAgua();
    }
    
    //valida a inserção de preço no café
    public final void setPreco(float valor){
        if(valor >= 0){
            this.preco = valor;
        }
        else{
            throw new RuntimeException("Só um palpite: \n" + 
                                       "dando tudo errado, grite. \n"  +
                                       "Ulisses Tavares \n" +
                                       "(Pare de ser tão bonzinho)");
        }
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    //funções que criam os ingredientes//

    @Override
    public Acucar criarAcucar() {
        return new Acucar(0);
    }

    @Override
    public Bicarbonato criarBicarbonato() {
        return new Bicarbonato(0);
    }

    @Override
    public CafeSoluvel criarCafeSoluvel() {
        return new CafeSoluvel(0);
    }

    @Override
    public Canela criarCanela() {
        return new Canela(0);
    }

    @Override
    public Chocolate criarChocolate() {
        return new Chocolate(0);
    }

    @Override
    public LeitePo criarLeitePo() {
        return new LeitePo(0);
    }

    @Override
    public LeiteLiq criarLeiteLiq() {
        return new LeiteLiq(0);
    }

    @Override
    public CafeSemCafeina criarCafeSemCafeina() {
        return new CafeSemCafeina(0);
    }
    
    @Override
    public final Agua criarAgua() {
        return new Agua(100);
    }
    
    @Override
    public String toString(){
        return "Ingredientes necessários para o ";
    }
    
}
