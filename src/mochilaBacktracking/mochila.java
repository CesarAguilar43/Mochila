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
public class mochila {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        arrayElementos();//Inicializamos los 4 elementos de nuestra mochila
        ObjetosMochila m_base = new ObjetosMochila(15, arrayElementos().length);
        ObjetosMochila m_opt = new ObjetosMochila(15, arrayElementos().length);
        llenarMochila(m_base, arrayElementos(), false, m_opt);
        formato(m_opt);
    }

    public static void llenarMochila(ObjetosMochila m_base, Elemento[] elementos, boolean llena, ObjetosMochila m_opt) {

        //si esta llena
        if (llena) {
            //compruebo si tiene mas beneficio que otra
            if (m_base.getBeneficio() > m_opt.getBeneficio()) {

                Elemento[] elementosMochBase = m_base.getElementos();
                m_opt.clear();

                //metemos los elementos
                for (Elemento e : elementosMochBase) {
                    if (e != null) {
                        m_opt.aniadirElemento(e);
                    }

                }

            }

        } else {
            //Recorre los elementos
            for (int i = 0; i < elementos.length; i++) {
                //si existe el elemento
                if (!m_base.existeElemento(elementos[i])) {
                    //Si el peso de la mochila se supera, indicamos que esta llena
                    if (m_base.getPesoMaximo() > m_base.getPeso() + elementos[i].getPeso()) {
                        m_base.aniadirElemento(elementos[i]); //añadimos
                        llenarMochila(m_base, elementos, false, m_opt);
                        m_base.eliminarElemento(elementos[i]); // lo eliminamos
                    } else {
                        llenarMochila(m_base, elementos, true, m_opt);
                    }

                }

            }

        }

    }

    public static Elemento[] arrayElementos() {
        // Dispondremos de 4 elementos que manejaremos dentro de un arreglo de la clase Elemento
        Elemento[] elementos = {
            new Elemento("A", 1, 1),
            new Elemento("B", 2, 2),
            new Elemento("C", 1, 2),
            new Elemento("D", 12, 4)
        };
        return elementos;
    }

    public static void formato(ObjetosMochila m_opt) {
        System.out.print("Objeto\t Peso\t Beneficio\n");
        System.out.println(m_opt);
    }

}
