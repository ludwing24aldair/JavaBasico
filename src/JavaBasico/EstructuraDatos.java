
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstructuraDatos {
    public void array(){
        String apellido = "Mamani";
        Object[]datos={"daniel","juan","senati","pedro",23,true,3.12};
        
        //obtener la cantidad de datos
        int cantidad = datos.length;
        System.out.println("la cantidad de datos de mi array de datos es:"+cantidad);
        System.out.println(datos[0]);
        
        for(int i = 0;i <= cantidad -1;i++){
            System.out.println(datos[i]);
            if(datos[i] == "senati")
                System.out.println("se encontro la palabra"+datos[1]);
            
        //iterando usar est cont if ()si se encuentra la palabra "senati" print por consola se encontro la plabra: senati
        }
    }
    
public void list(){
    List<String> nombres = new ArrayList<>();
    nombres.add("Marco");
    nombres.add("Pablo");
    nombres.add("Pedro");
    
    List<String> nombresNuevos = new ArrayList<>();
    nombresNuevos.add("Diego");
    nombresNuevos.add("Maria");
    nombresNuevos.add("Ana");
    
    //addALL
    nombres.addAll(nombresNuevos);
    //Cantidad de datos
    System.out.println("Cantidad de datos: "+ nombres.size());
    //obtener datos
    System.out.println("El dato es: "+nombres.get(0));
    
    for(int i = 0;i <= nombres.size() -1;i++){
            System.out.println("El dato es: "+nombres.get(i));
            if(nombres.get(i) == (Object)"Diego"){//.equals()
                System.out.println("Se encontro la palabra "+nombres.get(i));
            }         
        }
    //remover
    nombres.remove("Diego");
   
    //encontrar un dato
    nombres.contains("Pablo"); //boolean
    
    //el indice de dato
    nombres.indexOf("Pablo");//int
    
    //ordenar una lista
    Collections.sort(nombres);
    
    //revertir una lista
    Collections.reverse(nombres);
    
    //reemplazar un dato
    nombres.set(1, "Jose Luis");
    
    System.out.println("---------------------------------");    
    
    for(String item: nombres){
        System.out.println("El dato es: "+ item);   
    }
    System.out.println("---------------------------------");
    //limpiar toda la lista
    nombres.clear();
}
public void map (){
    Map<String, Integer> edades = new HashMap<>();
    edades.put("Marta", 50);
    edades.put("Diego", 34);
    edades.put("Elias", 12);
    edades.put("Ada", 12);
    
    //remover datos
    edades.remove("Elias");
    //Cantidad de datos
    edades.size();
    
    
        for(String item : edades.keySet()){
        System.out.println("Clave: "+ item + "Valor: "+ edades.get(item));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if(this.edades.keySet() >= 18 && this.edades.keySet() <45){
            System.out.println("Es mayor de edad");
        }else if(edades.keySet() >= 45){
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor de edad");
        }
        }
    

    }
}
