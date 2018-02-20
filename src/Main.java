import java.util.Scanner;

/**
 *
 * @author Flexxo333
 */
public class Main {
    public static void main(String[] args) {
        
        Alcancia a = new Alcancia();
        
        System.out.println("Digite la denominación de la moneda que desea agregar \n1)$500 \n2)$200 \n3)$100 \n4)$50 \n5)$20");
    
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        
        //System.out.println("Prueba al digitar la moneda manualmente");
        //a.agregarMoneda(coin);
        
        
        System.out.println("Prueba switch/case");
        a.agregarMoneda2(coin);
        
        a.monedasDeCadaDenominacion();
        
        a.calcularAhorros();
        
        a.romperAlcancia();
              
        
        
    };
};
