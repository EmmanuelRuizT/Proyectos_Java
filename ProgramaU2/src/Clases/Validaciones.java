/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jemma
 */
public class Validaciones {
   
    public String validarEnteros(String numero){
         
        int c = 0;
        String a="";
        for(int x=0; x<numero.length();x++){
            
            if (numero.charAt(x)=='.'){
                c++;
            }
        }   
        if(c==1){
            a=  "decimal";
        }else if(c==0){
            a= "entero";
        }
        return a;
    }

}