package Collections.maps;

import java.lang.classfile.TypeAnnotation.SupertypeTarget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.Contacto;

public class Maps {
    //Map<k,v> es una interfaz que representa una colección de pares clave-valor, donde cada clave es única y se asocia con un valor correspondiente. Los mapas permiten almacenar y recuperar valores utilizando sus claves asociadas.
    //Map<tipoClave, tipoValor> 
    //Map<String,integer>
    public Map <String, Integer> construirHashMap() {
        // Agregar elementos al HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println("Tamaño del HashMap: " + map.size());
        System.out.println("valor de la clave 'A': " + map.get("A"));
        System.out.println("contiene el valor de 'A' ="+map.containsKey("A"));
        System.out.println(map);
        //System.out.println(map.values().toArray());
        // UN VALOR SI SE PUEDE REPETIR Y LA CLAVE NO
        //POR ESO LOS VALORES SIEMPRE A UN ARREGLO Y LAS CLAVES NO 
        for(int i=0;i< map.size ();i++ ){
            //MAP-> V->VALORES ->ARRAY->ARRAY[POS]
            System.out.println(map.values().toArray()[i]);
        }
        //MAP-> K->KEYS ->SET->VALOR DEL SET
        for (String k : map.keySet()) {
            System.out.println(k);//A,B,C
        }
        //los set son solo generico de un valor tipo T SET<T>
        //SET EN MAPAS ENTRYSET<S,I>
        System.out.println("Clave valor");
        for ( Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        return map;
    } 

    public LinkedHashMap<String ,Integer>coLinkedHashMap(){
        System.out.println("Metodo linkeHashMap");
        LinkedHashMap<String,Integer> LMap=new LinkedHashMap<>();
        LMap.put("A", 2);
        LMap.put("B", 3);
        LMap.put("A", 5);
        LMap.put("C", 50);
        LMap.put("D", 5);
        LMap.put("F", 3);
        LMap.put("G", 8);
        LMap.put("H", 85);
        LMap.put("I", 5);
        System.out.println(LMap);
        System.out.println(LMap.entrySet());
        return LMap;

    }
    public Map<String ,Integer>cTreeMap(){
         System.out.println("Metodo TreeMap");
        Map<String,Integer> LMap=new TreeMap<>();
        LMap.put("A", 2);
        LMap.put("B", 3);
        LMap.put("A", 5);
        LMap.put("C", 50);
        LMap.put("D", 5);
        LMap.put("F", 3);
        LMap.put("G", 8);
        LMap.put("H", 85);
        LMap.put("I", 5);
        System.out.println(LMap);
        System.out.println(LMap.entrySet());
        return LMap;
    }
    public void eliminarDuplicadosAndSort (List<Contacto>contactos){
        Set<Contacto> Tset = new TreeSet<>();
        for (Contacto contacto : contactos) {
            Tset.add(contacto);
            
        }

    }

}

