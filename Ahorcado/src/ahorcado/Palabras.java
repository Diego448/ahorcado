package ahorcado;
import java.awt.Graphics;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Diego
 */
public class Palabras {
    public static final String[] frutas = {"uva", "kiwi", "fresa", "sandia", "naranja"};
    public static final String[] animales = {"oso", "leon", "tigre", "gorila", "tiburon"};
    public static final String[] personas = {"Jun", "John", "Emile", "Carter", "Cortana"};
    public static char separarPalabra(String palabra, int posicionL){
        char l;
            l = palabra.charAt(posicionL);
            return l;
    }
    public static void dibujarAhorcado(Graphics g, int a){
        switch(a){
            case 0:
                g.drawLine(307, 60, 410, 60);
                g.drawLine(410, 60, 410, 110);
                break;
            case 1:
                g.drawOval(380, 110, 60, 60);
                break;
            case 2:
                g.drawLine(410, 170, 410, 270);
                break;
            case 3:
                g.drawLine(410, 270, 380, 350);
                break;
            case 4:
                g.drawLine(410, 270, 440, 350);
                break;
            case 5:
                g.drawLine(410, 190, 380, 250);
                break;
            case 6:
                g.drawLine(410, 190, 440, 250);
                g.drawLine(397, 127, 403, 133);
                g.drawLine(397, 133, 403, 127);
                g.drawLine(423, 127, 429, 133);
                g.drawLine(423, 133, 429, 127);
                g.drawLine(397, 150, 423, 150);
                break;
        }
    }
    public static void crearRegistro(String nombre) throws IOException{
        FileWriter reg1 = null;
        try{
        reg1 = new FileWriter("Reg.txt");
        reg1.write(nombre);
        }finally{
            reg1.close();
        }
    }
}