/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrets;

import Abstracts.BluRay;
import Abstracts.DVD;
import Abstracts.FabricaDiscos;

/**
 *
 * @author Alejandro
 */
public class FabricaDiscos_CapaSimple implements FabricaDiscos   {

    @Override
    public BluRay crearBluray() {
        return new BluRayCapaSimple();
    }

    @Override
    public DVD crearDVD() {
        return new DVDCapaSimple();
    }
    
}
