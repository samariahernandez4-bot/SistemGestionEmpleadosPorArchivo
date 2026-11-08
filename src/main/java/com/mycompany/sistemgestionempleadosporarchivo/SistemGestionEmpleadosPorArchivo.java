/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemgestionempleadosporarchivo;
import controlador.EmpleadoControlador;
import java.util.ArrayList;

/**
 *
 * @author curac
 */
public class SistemGestionEmpleadosPorArchivo {

    public static void main(String[] args) {
       EmpleadoControlador controller = new EmpleadoControlador();
       
       //1. Probar el registro de empleados
       boolean exito1 = controller.registrarEmpleado("EMP01", "Alexander Maradiaga", "Tegucigalpa", "Col. Palmira", 15000, 2500);
       boolean exito2 = controller.registrarEmpleado("EMP02", "Maria Lopez", "San Pedro Sula", "Barrio Gualmirito", 18000, 3000);
       
       if (exito1 && exito2){
           System.out.println("¡Empleados guardados con exito en empleado.txt!");
       }
       
       //2. Leer los datos persistivos en el archivo
       System.out.println("\n--- Lista de empleados en archivos ---");
       
       ArrayList<String> empleados = controller.listarEmpleados();
       
       for (String emp : empleados){
           System.out.println(emp);
       }
    }
}
