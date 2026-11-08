/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;

/**
 *
 * @author curac
 */
public class Direccion implements Serializable{
    private String ciudad;
    private String calle;
    
    public Direccion(String ciudad, String calle){
        this.ciudad = ciudad;
        this.calle = calle;
    }
    public String getciudad(){return ciudad;}
    public String getcalle(){return calle;}
    
    @Override
    public String toString(){
        return ciudad + ","+ calle;
    }
}