package in.blogspot.randomcompiler.generic.linked.list.impl;

public class List<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<T>();
        newNode.setData(data);
        
        if(head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while(last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
    }
    
    public void print() {
        Node<T> temp = head;
        
        while(temp != null) {
            System.out.println(temp + " ");
            temp = temp.getNext();
        }
    }
    
    public void remove(T data) {
        Node<T> prev = head;
        Node<T> current = head;
        
        while(current != null) {
            if((current.getData() == null && data == null) || current.getData().equals(data)) {
                if(current == head) {
                    head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
            }
            prev = current;
            current = current.getNext();
        }
    }
}
