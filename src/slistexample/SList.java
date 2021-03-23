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
public class SList<E> {
    private int size;
    private SNode<E> head;
    private SNode<E> tail;
    
    public SList(){
        head = null;
        tail = null;
    }
    
    public void addFirst(E element){
        head = new SNode<>(element, head);
        if(isEmpty()){
            tail = head;
        }
        size++;
    }
    
    public E first(){
        return (E)head;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
