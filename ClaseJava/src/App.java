import javax.swing.JOptionPane;
//& y | sigue con los siguientes operadores lógicos, && y || no pierde tiempo
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null, "Hola","Eventos", JOptionPane.PLAIN_MESSAGE);
        byte edad = -128;
        System.out.println(edad);
        float height = 1.7f;
        boolean tengoHambre = true;
        char inicial = 'J';
        String nombre = "Daniel";
        if(5<2 || 3>2){
            System.out.println("Hola");
        }
    }
}
