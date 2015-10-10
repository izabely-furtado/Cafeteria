/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.promocoes;

import cafeteria.util.cafes.FabricaCafeSemCafeina;

/**
 *
 * @author IzabelyFurtado
 * (ii) terça-feira, quintafeira e sábado o café sem cafeína é metade do preço
 */
public class FabricaPromoCafeSemCafeina extends FabricaPromoCafe{
    protected FabricaCafeSemCafeina fabSemCafeina;
    public FabricaPromoCafeSemCafeina() {
        super();
        this.fabSemCafeina = this.criaCafeSemCafeina();
    }
    
    @Override
    public String toString(){
        return "Cafe Sem Cafeína: \n" 
              + "de R$ " + this.fabSemCafeina.getPreco()
              + " por R$ " + this.fabSemCafeina.getPreco()/2 
              + "\n";
    }
    
}
