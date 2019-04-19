/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploafdiscos;

import Abstracts.BluRay;
import Abstracts.DVD;
import Abstracts.FabricaDiscos;
import Concrets.FabricaDiscos_CapaSimple;

/**
 *
 * @author Alejandro
 */
public class EjemploAFDiscos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaDiscos fabrica;
        DVD dvd;
        BluRay bluray;
        fabrica = new FabricaDiscos_CapaSimple();
        dvd = fabrica.crearDVD();
        bluray= fabrica.crearBluray();
        System.out.println(dvd);
        System.out.println(bluray);
        
    }
    
}
