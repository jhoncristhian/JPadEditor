
package Final;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Funcions implements KeyListener{
    Notas nota;
    String cod = "";//evento del boton
    ArrayList <String> lista = new ArrayList<>();
    //array para lo condicion del else if
    public Funcions(Notas nota){
        this.nota = nota;
        this.nota.txtArea.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        saveEventTeclado(ke);
        detectarTecladoModificarTitulo(ke);
        //System.out.println("tmr:"+ke.getKeyCode()+ "  cod:"+cod);
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    private void saveEventTeclado(KeyEvent e) {
        //eventos del teclado para guardar
        cod += e.getKeyCode();
        
        if (("1783").equals(cod)) {
            nota.save();
            cod = "";
            System.out.println("guardado");
        } else if (("1717").equals(cod) || cod.charAt(0) != '1' || cod.charAt(1) != '7') {
            cod = "";
        }else if(cod.length() > 4){
            cod="";
        }
        nota.setTitle(nota.title + "- Spectre");
    }
    
    //detectar que se ha escrito algo y poner asterisco
    private void detectarTecladoModificarTitulo(KeyEvent e) {
        int codigo = e.getKeyCode();
        //System.out.println("code:"+codigo);
        //65 al 90 a-z, 48-57 numeros, 222,0,521,162,44,45,46,153,16,129,9,8,111,106,109,107
        int lista[] = {0, 222, 521, 162, 44, 45, 46, 153, 16, 129, 9, 8, 111, 106, 109, 107, 32};
        boolean res = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == codigo) {
                res = true;
            }
        }
        //System.out.println("res:"+res);

        if (codigo > 57 && codigo < 90 || res) {
            nota.setTitle("*" + nota.title + "- Spectre");
        }
    }
}
