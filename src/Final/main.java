/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

public class main {
    public static void main(String []args){
        Notas nota = new Notas();
        nota.setLocationRelativeTo(null);
        Funcions evento = new Funcions(nota);
        nota.setVisible(true);
    }
}
