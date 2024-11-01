package com.red_social.rest.controller.tda.list;

public class Node <E>{
    private E info;
    private Node <E> next;
    
// Getter para info
public E getInfo() {
    return info; // Devuelve la información del nodo
}

// Setter para info
public void setInfo(E info) {
    this.info = info; // Establece la información del nodo
}

// Getter para next
public Node<E> getNext() {
    return next; 
}

// Setter para next
public void setNext(Node<E> next) {
    this.next = next; 
}

public Node(E info){
    this.info = info;
    this.next = null;
}
public Node(E info, Node<E> next){
    this.info = info;
    this.next = next;
}
}
