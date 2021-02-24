/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/**
*Clase CCuenta que recoge los datos de cuentas y datos de usuario
*@author Jose Antonio Fornell Márquez
*@version 1.0
*/
public class CCuenta {


  /**
  *Atributos definidos previamiente
  * para la clase cuenta
  */
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
    *Metodo constructor sin argumentos
    */
  
    public CCuenta ()
    {
    }
    /**
    *Metodo constructor de la clase CCuenta
    *@param nom Se refiere al nombre del cliente
    *@param cue Se refiere al número de cuenta del cliente
    *@param sal Se refiere al saldo que hay en la cuenta
    *@param tipo Se refiere al tipo de interés de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /**
    *Metodo para asignar el nombre del cliente
    * @param nom nombre para el cliente
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /**
    *Metodo que devuelve el nombre del cliente
    *
    * @return <code>nombre</code>Devuelve el nuevo nombre para el cliente
    */
    public String obtenerNombre()
    {
        return nombre;
    }
    /**
    * Metodo que devuelve saldo de la cuenta
    *
    * @return <code>saldo</code> devuelve el saldo de la cuenta
    */
     public double estado ()
    {
        return saldo;
    }
    
    /**
    *Metodo para ingresar dinero en la cuenta
    *
    *@param cantidad Dinero que se va a ingresar
    *@throws Exception controla que no se puede ingresar una cantidad negativa
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }
    /**
    * Metodo para retirar dinero de la cuenta
    *@param cantidad dinero a retirar
    *@throws Exception controla que no se puede retira cantidades negativas o que no tenga
    * suficiente saldo
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
    *Metodo que devuelve el número de cuenta
    *@return <code>cuenta</code> devuelve el número de cuenta
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
    *Metodo para modificar el número de cuenta
    *@param cuenta nuevo número de cuenta
    */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
    *Metodo para modificar el saldo de la cuenta
    *@param saldo nuevo saldo de la cuenta
    */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  /**
  *Metodo que devuelve el tipo de interés
  *@return <code>tipoInterés</code> devuelve el tipo de interés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }
  /**
  *Metodo para modificar el tipo de interés
  *@param tipoInterés nuevo tipo de interés
  */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
