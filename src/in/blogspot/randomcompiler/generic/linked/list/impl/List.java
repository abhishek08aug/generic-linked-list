package in.blogspot.randomcompiler.generic.linked.list.impl;

public class List<T extends Comparable> {
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
    
    public T getNthNodeData(int index) {
        int count = 0;
        
        Node<T> current = head;
        while(current != null) {
            ++count;
            if(count == index) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }
    
    public void iterativeReverse() {
        Node<T> prev = null;
        Node<T> current = head;
        while(current != null) {
            Node<T> next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void recursiveReverse() {
        if(head == null) {
            return;
        }
        Node<T> next = head.getNext();
        head.setNext(null);
        recursiveReverse(head, next);
    }
    
    private void recursiveReverse(Node<T> node, Node<T> next) {
        if(next == null) {
            head = node;
        } else {
            Node<T> nextNext = next.getNext();
            next.setNext(node);
            recursiveReverse(next, nextNext);
        }
    }
    
    public void pairwiseSwap() {
        if(head == null) {
            return;
        }
        if(head.getNext() == null) {
            return;
        }
        Node<T> current = head;
        Node<T> next = head.getNext();
        while(current != null && next != null) {
            T temp = current.getData();
            current.setData(next.getData());
            next.setData(temp);
            current = next.getNext();
            if(current != null) {
                next = current.getNext();
            }
        }
    }
    
    public void deleteAlternate() {
        if(head == null) {
            return;
        }
        Node<T> current = head;
        while(current != null) {
            if(current.getNext() != null) {
                current.setNext(current.getNext().getNext());
                current = current.getNext();
            } else {
                break;
            }
        }
    }
    
    public void deleteNodesWithLargeInRight() {
        deleteNodesWithLargeInRight(head, null);
    }
    
    private Node<T> deleteNodesWithLargeInRight(Node<T> current, Node<T> prev) {
        if(current == null) {
            return null;
        }
        Node<T> maxInRight = deleteNodesWithLargeInRight(current.getNext(), current);
        
        if(maxInRight != null && maxInRight.getData().compareTo(current.getData()) > 0) {            
            if(current == head) {
                head = current.getNext();
            } else {
                prev.setNext(current.getNext());
            }
            return maxInRight;
        }
        return current;
    }
}
