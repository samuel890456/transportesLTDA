/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ESTIVEN C
 */
public class metodos {
    public boolean contieneNumeros(String cadena) {
    for (char c : cadena.toCharArray()) {
        if (Character.isDigit(c)) {
            return true; // La cadena contiene al menos un número
        }
    }
    return false; // La cadena no contiene números
}
    
}
