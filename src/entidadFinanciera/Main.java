/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


/**
 * Clase Main para probar la clase CCuenta<br>
 * @author anama
 */
public class Main {

    /**
     * Metodo principal para probar la clase CCuenta<br>
     * @param args atributos
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo inicial es "+ saldoActual + "EUR" );
        
    
        try {
            probarIngresar(objetoCuenta, 500, 3000);
        } catch (Exception e) {
            System.out.println("Error al ingresar dinero: " + e.getMessage());
        }
        
        try {
            probarRetirar(objetoCuenta, 400, 2600);
        } catch (Exception e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }

        System.out.println("El saldo actual es "+ objetoCuenta.estado() + "EUR" );
    }

    /**
     * Metodo para probar el método ingresar de la clase CCuenta<br>
     * @param c objeto de la clase CCuenta<br>
     * @param cantidad cantidad a ingresar<br>
     * @param cantidadEsperada cantidad esperada después de la operación<br>
     * @throws Exception si la cantidad a ingresar es negativa o la cantidad esperada no coincide con el saldo actual
     */
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        double saldoActual = c.estado();
        if (saldoActual != cantidadEsperada){
            throw new Exception("La cantidad esperada no coincide con el saldo actual");
        }
    }

    /**
     * Método para probar el método retirar de la clase CCuenta<br>
     * @param c objeto de la clase CCuenta<br>
     * @param cantidad cantidad a retirar<br>
     * @param cantidadEsperada cantidad esperada después de la operación<br>
     * @throws Exception si la cantidad a retirar es negativa, la cantidad a retirar es mayor que el saldo actual, o la cantidad esperada no coincide con el saldo
     */
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        c.retirar(cantidad);
        double saldoActual = c.estado();
        if (saldoActual != cantidadEsperada) {
            throw new Exception("La cantidad esperada no coincide con el saldo actual");
        }
    }
}    
