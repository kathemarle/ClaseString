/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author marleny
 */
public class ClaseString {

   
    public static void main(String[] args) {
       
      String s = "iesmaralboran.com";
      
      //tamaño de la cadena
        System.out.println("Tamaño" + s.length());
        
        //obtener el char de una posicion concreta
        
        System.out.println("Chart asociado a la posicion 5: " + s.charAt(5));
        
        
        //obtener subcadena desde el ccaracter i-ésimo hasta el final
        //de la cadena
        String subcadena = s.substring(3);
        System.out.println("subcadena = "+ subcadena);
        
      //obtener subcadena desde el ccaracter i-ésimo hasta el caracter j-ésimo
        //de la cadena
        subcadena = s.substring(6,13);
        System.out.println("subcadena = "+ subcadena);
        
        //concatenar cadenas. equivale al operador + /concat
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1+s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("nuevo"+ nuevo);
        System.out.println("nuevo2" + nuevo2);
    }
    
}
