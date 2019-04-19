/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrets;

import Abstracts.BluRay;

/**
 *
 * @author Alejandro
 */
public class BluRayCapaSimple extends BluRay {

    @Override
    public String getCapacidad() {
        return "3.7GB";
    }

    @Override
    public String getNombre() {
        return "BluRay Capa Simple";
    }

    @Override
    public String getPrecio() {
        return "2.00$";
    }
}
