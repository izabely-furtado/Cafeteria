/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.promocoes;

import cafeteria.util.cafes.FabricaCafeCappuccino;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author IzabelyFurtado
 * (iii) domingo o cappuccino é metade do preço.
 */
public class FabricaPromoCappuccino extends FabricaPromoCafe{
    public FabricaPromoCappuccino() {
        super();
        
    }

    @Override
    public FabricaCafeCappuccino criaCappuccino() {
        FabricaCafeCappuccino fc = new FabricaCafeCappuccino();
        fc.setPreco(this.fabCappuccino.getPreco()/2);
        return fc;
    }
    
    @Override
    public String toString(){
        return "Cappuccino: \n" 
              + "de R$ " + this.fabCappuccino.getPreco()
              + " por R$ " + this.criaCappuccino().getPreco() 
              + "\n";
    }
    
}
