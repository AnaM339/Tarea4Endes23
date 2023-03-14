/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
        try {
            probarIngresar(objetoCuenta, 500, 500);
        } catch (Exception e) {
            System.out.println("Error al ingresar dinero: " + e.getMessage());
        }
        
        try {
            probarRetirar(objetoCuenta, 400, 400);
        } catch (Exception e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }
    }
       
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        double saldoActual = c.estado();
        if (saldoActual != cantidadEsperada){
            throw new Exception("La cantidad esperada no coincide con el saldo actual");
        }
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.retirar(cantidad);
        double saldoActual = c.estado();
        if (saldoActual != cantidadEsperada){
            throw new Exception("La cantidad esperada no coincide con el saldo actual");
    }
}
