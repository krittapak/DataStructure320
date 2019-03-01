/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author KRITTAPAK
 */
public class TestHashSet {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Cat");
        s.add("Dog");
        s.add("Bird");
        s.add("Duck");

        String x = "Cat";

        System.out.println("Cat".hashCode());
        System.out.println(x.hashCode());

        System.out.println(s.contains("Dog"));
    }

    static void testHashCode() {
        Set<NewStudent> st = new HashSet();
        st.add(new NewStudent(1001, "Somchai"));
        st.add(new NewStudent(1002, "SomSri"));
        st.add(new NewStudent(1003, "SomYing"));
        NewStudent ns = new NewStudent(1002, "SomSri");
        NewStudent ns2 = new NewStudent(1002, "SomSri");
        System.out.println(ns.hashCode());
        System.out.println(ns2.hashCode());
        System.out.println(st.contains(ns));
    }
}

class NewStudent {

    int id;
    String name;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NewStudent other = (NewStudent) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public NewStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
