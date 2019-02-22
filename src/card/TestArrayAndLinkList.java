/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author INT303
 */
public class TestArrayAndLinkList {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(i + 1001, (char) (56 + Math.random() * 26) + ""));
        }
        list.add(7,new Student(1110,"Somchai"));
        for (Student student : list) {
            System.out.println(student);
        }
        
        Student st = new Student(1110,"Somchai");
        int pos = list.indexOf(st);
        System.out.println("pos= "+pos);
    }

    private static class Student {

        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + this.id;
            hash = 37 * hash + Objects.hashCode(this.name);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }

    }
}
