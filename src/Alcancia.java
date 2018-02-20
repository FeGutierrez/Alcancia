/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Alcancia {
    
    //atributos
    int veinte=0;
    int cincuenta=0;
    int cien=0;
    int doscientos=0;
    int quinientos=0;
    int saldoTotal;
    
    //constructor
    
    public Alcancia(){
        
    }
    
    
    //metodos
    //Inclui dos metodos para la adición de monedas, uno funciona con Case/switch y el otro usa los módulos para hallar la moneda que está siendo introducida
    
    public void agregarMoneda2(int x){
        int opc=x;
        switch (opc){
            case 1: quinientos +=1;
                break;
            case 2: doscientos +=1;
                break;
            case 3: cien +=1;
                break;
            case 4: cincuenta +=1;
                break;
            case 5: veinte +=1;
                break;
            default: System.out.println("Señor(a) usuario(a) por favor ingrese una moneda del menú");
                break;
        };
    };
    
    public void agregarMoneda(int x){
        if(x%500==0){
            quinientos +=1;
        } else if (x%200==0 ) {
            doscientos += 1;
        } else if(x%100==0){
            cien += 1;
        } else if(x%50==0){
            cincuenta +=1;
        } else if(x%20==0) {
             veinte +=1;
        } else {
            System.out.println("Señor(a) usuario(a), por favor ingrese una moneda de $500, $200, %100, $50 o $20");
        }
    };
    
    public void monedasDeCadaDenominacion(){
        System.out.println("Monedas de $500: " + this.quinientos);
        System.out.println("Monedas de $200: " + this.doscientos);
        System.out.println("Monedas de $100: " + this.cien);
        System.out.println("Monedas de $50: " + this.cincuenta);
        System.out.println("Monedas de $20: " + this.veinte);
    };
    
    public void calcularAhorros(){
        saldoTotal=(quinientos*500)+(doscientos*200)+(cien*100)+(cincuenta*50)+(veinte*20);        
        System.out.println("Los ahorros totales son: $"+saldoTotal);
    };
    
    public void romperAlcancia(){
        veinte=0;
        cincuenta=0;
        cien=0;
        doscientos=0;
        quinientos=0;        
        System.out.print("Has roto tu alcancia. ");
        this.calcularAhorros();
    };
    
    
    
};
