package com.jsps.poointerfaces.imprenta.modelo;

public interface Imprimible { //Las interfaces solo pueden tener atributos final y estáticos

    String TEXTO_DEFAULT = "Imprimiendo valor por defecto";
    default String imprimir(){
        return TEXTO_DEFAULT;
    }
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}