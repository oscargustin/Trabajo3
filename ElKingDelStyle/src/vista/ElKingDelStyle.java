
package vista;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class ElKingDelStyle {

    
    public static void main(String[] args) {
       VentanaPrincipal ventPrin=new VentanaPrincipal();
       ventPrin.setLocationRelativeTo(null);
       ventPrin.setTitle("El King Del Style");
       ventPrin.setResizable(false);
       ventPrin.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       ventPrin.setVisible(true);
    }
    
}
