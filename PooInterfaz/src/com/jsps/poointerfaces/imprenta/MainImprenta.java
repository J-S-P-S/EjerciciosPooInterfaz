package com.jsps.poointerfaces.imprenta;

import com.jsps.poointerfaces.imprenta.modelo.*;

import static com.jsps.poointerfaces.imprenta.modelo.Genero.*;
import static com.jsps.poointerfaces.imprenta.modelo.Imprimible.*;

public class MainImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...",
                new Persona("Sebastian", "Perez"), "Ingeniero de sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. reusables POO",
                PROGRAMACION);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Martin", "Fowler"), new Persona("James", "Gosling"));
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() { //Sobreescribir el método imprimir de la interfaz Imprimible
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima";
            }
        });

        /*imprimir(new Imprimible() { //Crear una clase anónima/al vuelo de la interfaz Imprimible
        });*/

        System.out.println(TEXTO_DEFAULT);
    }

}