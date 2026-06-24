package Collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Contacto;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }
    public Set<String> construLinkedHashSet() {
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        return linkedHashSet;
    }
    public Set<String> construirTreeSet() { 
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegegg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");
        return treeSet;
    }
    public Set<Contacto> construirTreeSetConComparador(
    ) { 
        Set<Contacto> treeSet = new TreeSet<>();
         //return c1.getNombre().compareTo(c2.getNombre());
        treeSet.add(new Contacto("Juan", "Perez", "123456789"));
        treeSet.add(new Contacto("Ana", "Gomez", "987654321"));
        treeSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        treeSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        treeSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado no se agregará al TreeSet debido al comparador
        treeSet.add(new Contacto("Juan", "Lopez", "123456789")); // Duplicado en el nombre
        return treeSet;
        //Inrden
    }
    public Set<Contacto> construirHashSetContacto() { 
        
        Set<Contacto> hashSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        hashSet.add(c1);
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        hashSet.add(c2);
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        hashSet.add(c3);
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        hashSet.add(c4);
        Contacto c5 = new Contacto("Juan", "Perez", "123456789");
        hashSet.add(c5);
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        hashSet.add(c6);
        return hashSet;
       
    }

}
