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
        
        //devuelve el índice dentro de la cadena
        //de la primera aparición de la cadena a buscar
        int indice = nuevo.indexOf("mar");
        System.out.println("indice: " + indice);
        
        indice = nuevo.indexOf("ran", 10);
                System.out.println("indice: " + indice);
                
                //metodos equals y equalsIgnoreCase: mayuscula de j
                System.out.println("Igualdad Java y java:" + "Java".equals("java"));
                System.out.println("Igualdad Java y java:" + "Java".equalsIgnoreCase("java"));
           
                //quitar espacios delannte y detras
                String espacios = " palabra palabra ";
                System.out.println("tamaño de espacios: "+ espacios.length());
                String sinEspaciosn = espacios.trim();
                System.out.println("tamañoe de sinEspacios: "+ sinEspaciosn.length());
                
                //reemplazo de caracteres
                System.out.println("String original: " + s2);
                
                String str2 = s2.replace('a', 'x');
                System.out.println("string reemplzo: " +  str2);
                
                //Contenido
                String aBuscar = "dealbox";
                System.out.println("¿Contiene: " + s2 + "la subcadena " + aBuscar + "? " + 
                        s2.contains(aBuscar));
                
                //probar metodos endWith, starsWith , isEmpty
                
                //obtener un array de char de la cadena
                //declaracin de una variablde array de tipo char
                char[] arrayChar;
                arrayChar = s2.toCharArray();
                
                //atributo length existe en todos los arrays y me indica su tamaño
                //equivalente al metodo length() de los String
              
                for(int i = 0; i < arrayChar.length; i++){
                    //para acceder a cada posicion del array uso los corchetes
                    System.out.println("posicion i = " + i + " contenido = " + arrayChar[i]);
                    
                   
                }
                
        }
    
}
