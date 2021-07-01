/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilaBacktracking;

/**
 *
 * @author pogbom
 */
public class Elemento {
    private int peso;
    private int beneficio;
    private String objeto ="";
 
    public Elemento(String obj,int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
        this.objeto = obj;
    }
 
    public int getPeso() {
        return peso;
    }
 
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public String toString(){
        String cadena ="";
        cadena=" "+objeto+"\t "+peso+"\t"+beneficio;
        return cadena;
    }
}
