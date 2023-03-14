/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase que representa una cuenta bancaria.<br>
 * Contiene métodos para ingresar, retirar y consultar el saldo de la cuenta.<br>
 * @author anama
 */
public class CCuenta {



    /**
     * Atributos de la clase CCuenta
     */
    private String nombre;//Nombre del titular
    private String cuenta;//Número de cuenta
    private double saldo;//Saldo actual de la cuenta
    private double tipoInterés;//Tipo de interés de la cuenta
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * El getter del atributo nombre<br>
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El setter del atributo nombre<br>
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El getter del atributo cuenta<br>
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * El setter del atributo cuenta<br>
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * El getter del atributo saldo<br>
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * El setter del atributo saldo<br>
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * El getter del atributo interés<br>
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * El setter del atributo interés<br>
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * El getter del atributo ERRORCANTIDADNEGATIVA<br>
     * @return ERRORCANTIDADNEGATIVA
     */
    public static String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }
    
    /**
     * Contructor vacío de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.<br>
     * @param nom el nombre de la persona titular de la cuenta.<br>
     * @param cue el número de cuenta.<br>
     * @param sal el saldo inicial de la cuenta.<br>
     * @param tipo el tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el saldo actual de la cuenta.<br>
     * @return el saldo actual de la cuenta.
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Método que permite ingresar una cantidad de dinero en la cuenta.<br>
     * @param cantidad la cantidad de dinero a ingresar.<br>
     * @throws Exception si la cantidad ingresada es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(getERRORCANTIDADNEGATIVA());
        setSaldo(getSaldo() + cantidad);
    }
    

    /**
     * Método que permite retirar una cantidad de dinero en la cuenta.<br>
     * @param cantidad la cantidad de dinero a retirar.<br>
     * @throws Exception si la cantidad a retirar es negativa.<br>
     * @throw new Exception si no hay saldo suficiente para realizar la retirada.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) 
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   