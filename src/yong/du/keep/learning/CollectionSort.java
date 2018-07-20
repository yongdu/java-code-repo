package yong.du.keep.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {

        public static void main(String[] args) {

            ArrayList<Person> list = new ArrayList<Person>();

            list.add(new Person("Yong", 28));
            list.add(new Person("Bo", 27));
            list.add(new Person("Young", 20));
            list.add(new Person("Yuan", 18));


            ArrayList<Student> listStudents = new ArrayList<Student>();
            listStudents.add(new Student(1,"Ada",30));
            listStudents.add(new Student(2,"C",27));
            listStudents.add(new Student(3,"java",10));

            System.out.printf("Original sort of list students : list:%s\n", listStudents);
            Collections.sort(listStudents,new AscIdComparator());
            System.out.printf("Age sort by ascending: list:%s\n", listStudents);

            Collections.sort(listStudents, new DescComparator());
            System.out.printf("Age sort by descending: list:%s\n", listStudents);

            System.out.println();
            System.out.printf("Original sort of list people:  list:%s\n", list);

            // comparable asc
            Collections.sort(list);
            System.out.printf("Age sort by ascending, list:%s\n", list);
            // java 8
            Collections.sort(list,Comparator.reverseOrder());
            System.out.printf("Age sort by descending, list:%s\n", list);

            //asc comparator
            Collections.sort(list, new AscAgeComparator());
            System.out.printf("Asc(age)  sort, list:%s\n", list);

            //desc comparator
            Collections.sort(list, new DescAgeComparator());
            System.out.printf("Desc(age) sort, list:%s\n", list);


        }


        private static void testEquals() {
            Person p1 = new Person("eee", 100);
            Person p2 = new Person("eee", 100);
            if (p1.equals(p2)) {
                System.out.printf("%s EQUAL %s\n", p1, p2);
            } else {
                System.out.printf("%s NOT EQUAL %s\n", p1, p2);
            }
        }


        static private class Person implements Comparable<Person>{
            int age;
            String name;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return name + " - " +age;
            }


            boolean equals(Person person) {
                if (this.age == person.age && this.name == person.name)
                    return true;
                return false;
            }


            @Override
            public int compareTo(Person person) {
                // age asc
                return this.age - person.age;
                /*age desc */
                // return this.age - person.age;
                /*name asc */
                //return name.compareTo(person.name);
                /*name desc */
                //return person.name.compareTo(name);
            }
        }

        private  static  class Student{
            int id;
            String name;
            int age;

            public Student(int id, String name, int age){
                this.age= age;
                this.id = id;
                this.name = name;
            }

            public String getName(){ return name;}
            public int getAge(){ return age;}
            public int getId(){ return id; }

            @Override
            public String toString() {
                return id + " - " + name + " - " +age ;
            }
        }

        private static class AscAgeComparator implements Comparator<Person> {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        }


        private static class DescAgeComparator implements Comparator<Person> {

            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge() - p1.getAge();
            }
        }

        private static class AscIdComparator implements Comparator<Student>{
            @Override
            public int compare(Student s1, Student s2){ return s1.getId() - s2.getId(); }
        }

        private static class DescComparator implements Comparator<Student>{
            @Override
            public int compare(Student s1, Student s2) { return s2.getId() - s1.getId();}
        }


}
