/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util;

import cafeteria.util.cafes.*;

/**
 *
 * @author IzabelyFurtado
 */
public class FabricaReceitas {
    
    public static String receitaCafeExpresso(){
        return new FabricaCafeExpresso().toString();
    }
    
    public static String receitaCafeSemCafeina(){
        return new FabricaCafeSemCafeina().toString();
    }
    
    public static String receitaCafeCappuccino(){
        return new FabricaCafeCappuccino().toString();
    }
    
}
