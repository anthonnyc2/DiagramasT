
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import modelo.Modelo;
import controlador.Controlador;
import vista.Vista2;

public class Figuras {

    public static void main(String[] args) {
        try {
            final JFrame frame = new JFrame();
            frame.setTitle("Ejemplo Modelo Vista Controlador (MVC) Comp�ladores e Interpretes UNET");
            //Set the window initial Size & default close operation
            frame.setVisible(true);
            Dimension fullscreen = Toolkit.getDefaultToolkit().getScreenSize();
            fullscreen.width = fullscreen.width - 400;
            fullscreen.height = fullscreen.height - 400;
            frame.setBounds(50, 50, fullscreen.width, fullscreen.height);
            frame.getContentPane().setPreferredSize(fullscreen);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container guiobjects = frame.getContentPane();
            guiobjects.setLayout(new BorderLayout());
            Modelo modelo = new Modelo();
            Vista2 vista = new Vista2(modelo);
            final Controlador controlador = new Controlador(modelo, vista);
            vista.setControlador(controlador);
            JScrollPane ModelScroll = new JScrollPane(vista, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            guiobjects.add(ModelScroll);
            //frame.pack();
        } catch (RuntimeException e) {
            exitApplication();
        }
    }

    public static void exitApplication() {
        System.out.println("Saliendo Adios...");
        System.exit(0);
    }
}
