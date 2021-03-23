/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slistexample;

/**
 *
 * @author Enubs
 */
public class SListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        SNode node1 = new SNode();
//        Person person1 = new Person();
//        person1.setLastname("Enubs");
//        person1.setFirstname("Ron");
//        person1.setAge(39);
//        node1.setData(person1);
//        node1.setData("Hello world");
//        node1.setNext(null);
//        System.out.println(node1.getData());

        Person person1 = new Person("Ron", "Enubs", 39);
        SList<SNode<Person>> personsList = new SList<>();
        SNode<Person> personNode1 = new SNode<>(person1, null);
        personsList.addFirst(personNode1);
        System.out.println(personsList.first().getElement().showPerson());
    }
}
