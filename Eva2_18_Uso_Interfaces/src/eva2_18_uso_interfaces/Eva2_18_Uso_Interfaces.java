/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_uso_interfaces;

/**
 *
 * @author invitado
 */
public class Eva2_18_Uso_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Figuras Fig = new Figuras(); no se puede crear por que es abstracto
        //MostrarDatos Fig = new MostrarDaots(); no se puede crear por que es abstracto
        System.out.println("Los datos del Circulo son:");
        Circulo Cir = new Circulo();
        Cir.setRadio(50);
        Cir.imprimirDatos();
        System.out.println("Los datos del Triangulo son:");
        Triangulo Tri = new Triangulo();
        Tri.setAltura(20);
        Tri.setBase(20);
        Tri.imprimirDatos();
    }
    
}
