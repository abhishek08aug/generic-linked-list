package in.blogspot.randomcompiler.generic.linked.list.impl;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> node) {
        this.next = node;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
    
}
