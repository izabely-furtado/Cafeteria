/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.promocoes;

import cafeteria.util.cafes.FabricaCafeExpresso;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author IzabelyFurtado
 *     (i) segunda-feira, quarta-feira e sexta-feira o café normal é metade do preço; 
 */
public class FabricaPromoCafeExpresso extends FabricaPromoCafe{
    public FabricaPromoCafeExpresso() {
        super();
    }
    
    @Override
    public FabricaCafeExpresso criaCafeExpresso() {
        FabricaCafeExpresso fc = new FabricaCafeExpresso();
        fc.setPreco(this.fabExpresso.getPreco()/2);
        return fc;
    }
    
    @Override
    public String toString(){
        return "Cafe Expresso: \n" 
              + "de R$ " + this.fabExpresso.getPreco()
              + " por R$ " + this.criaCafeExpresso().getPreco() 
              + "\n";
    }
    
}
