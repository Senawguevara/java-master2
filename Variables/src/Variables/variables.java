package Variables;

public class variables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        String saluda = " de nuevo mundo";
        //atributos
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        System.out.println("saludar.toLowerCase() = " + saludar.toLowerCase());
        System.out.println("saludar.repeat(3) = " + saludar.repeat(3));
        System.out.println("saludar.replace(saludar,\"hola\") = " + saludar.replace(saludar,"hola"));
        System.out.println("saludar.indexOf(0) = " + saludar.indexOf(1));
        System.out.println("saluda = " + saluda.concat(saluda + saludar));
        System.out.println("saluda = " + saluda.indent(0));



    }

}
