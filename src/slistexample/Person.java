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
public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public String showPerson(){
        return firstname + " " + lastname + ", " + age;
    }
}
