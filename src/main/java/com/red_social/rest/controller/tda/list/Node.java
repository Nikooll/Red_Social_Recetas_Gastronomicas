package com.red_social.rest.controller.tda.list;

public class Node<E> {
    private E info;          // Información contenida en el nodo
    private Node<E> next;     // Referencia al siguiente nodo

    // Constructor para inicializar el nodo con solo info
    public Node(E info) {
        this.info = info;
        this.next = null;
    }

    public Node(E info, Node<E> next) {
        this.info = info;
        this.next = next;
    }

    // Getter para obtener la información del nodo
    public E getInfo() {
        return info;
    }

    // Setter para establecer la información del nodo
    public void setInfo(E info) {
        this.info = info;
    }

    // Getter para obtener el siguiente nodo
    public Node<E> getNext() {
        return next;
    }

    // Setter para establecer el siguiente nodo
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
