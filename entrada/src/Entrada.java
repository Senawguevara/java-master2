import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {
        String numeroDecimal = JOptionPane.showInputDialog(null, "inserte el numero decimal");
        int decimal = Integer.parseInt(numeroDecimal);
        JOptionPane.showMessageDialog(null, "El decimal ingresado es: " + decimal);
        System.out.println("decimal = " + decimal);

    }
}
