/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.util.ArrayList;

/**
 *
 * @author pogbom
 */
public class Mochila {

    /**
     * @param args the command line arguments
     */
    static ArrayList<listaMochila> lista = new ArrayList<>();
    static ArrayList<listaMochila> combinacionesMochila = new ArrayList<>();
    static int capMax = 15;
    static int beneficio = 0;
    static int peso = 0;
    static String objeto ="";
    
    //https://github.com/dandev237/mochila-continua/blob/master/Mochila.java
    public static void main(String[] args) {
        llenarMochila();
        combinaciones();
        mostrarListas();
    }
    
   public static void llenarMochila() {
        //Añadiremos 4 objetos a una lista dandole como primer parametro el peso y despues el beneficio
        lista.add(new listaMochila("A", 2, 2));
        lista.add(new listaMochila("B", 1, 1));
        lista.add(new listaMochila("C", 1, 2));
        lista.add(new listaMochila("D", 12, 4));
    }

    public static void mostrarListas() {
        System.out.print("Objeto\t Peso\t Beneficio\n");
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(lista.get(i).nombre + "\t " + lista.get(i).pesoObjeto + "\t " + lista.get(i).benObjeto + "\t ");
        }
    }

    public static void combinaciones() {
        for (int i = 0; i <= lista.size() -1 ; i++) {
            combinacionesMochila.add(lista.get(i));
            //System.out.println(combinacionesMochila.get(i).nombre);
        }
        int j = 0;
        for (int i = 0; i <=lista.size() -1; i++) {
            combinacionesMochila.add(lista.get(j));
        }
        
    }

}
