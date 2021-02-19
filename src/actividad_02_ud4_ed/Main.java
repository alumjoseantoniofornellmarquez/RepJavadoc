/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*Clase Main recoge las acciones que van a ocurrir en nuestro programa
*@author Jose Antonio Fornell Márquez
*@version 1.0
*/

public class Main {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

   /**
   *Metodo main donde se indica la información y las nuevas cuentas
   *@param args son un arrays de tipo strings
   */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        int opcion=0;
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        do{
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion=Integer.parseInt(dato.readLine());
                if(opcion==1){
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                }else if(opcion==2){
                    System.out.println("¿Cuánto desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                }else if(opcion==3){
                    System.out.println("Finalizamos la ejecución");
                }else{
                    System.err.println("Opción errónea");
                }
/*                switch(opcion){
                    case 1:
                        System.out.println("¿Cuánto desea ingresar?: ");
                        float ingresar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,ingresar,opcion);
                        break;
                    case 2:
                        System.out.println("¿Cuátno desea retirar?: ");
                        float retirar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,retirar,opcion);
                        break;
                    case 3:
                        System.out.println("Finalizamos la ejecución");
                }
*/            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (opcion!=3);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    /**
    *Metodo para operar en las cuentas creadas y si falla algo devuelva un mensaje de error
    *@param cuenta1 objeto de la clase CCuenta que utiliza el metodo constructor de esta misma clase
    *@param cantidad que se va a ingresar que se obtiene de la información añadida posteriormente con el metodo
    * constructor de cuenta1
    *@param opcion va a indicar cual de las 2 opciones definidas ha de realizarse por ejemplo si se va a ingresar
    * o retirar dinero de la cuenta
    */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad,int opcion){
        if(opcion==2){
            try 
            {
                cuenta1.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
