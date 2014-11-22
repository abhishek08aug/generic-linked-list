package in.blogspot.randomcompiler.generic.linked.list.demo;

import in.blogspot.randomcompiler.generic.linked.list.impl.List;

public class GenericListDemo {
    public static void main(String[] args) {
        List<String> list1 = new List<String>();
        list1.add("It");
        list1.add("is");
        list1.add("a");
        list1.add("generic");
        list1.add("list");
        list1.add("to");
        list1.add("contain");
        list1.add("any");
        list1.add("type");
        list1.add("of");
        list1.add("data");        
        list1.print();
        System.out.println("5th node is: " + list1.getNthNodeData(5));
        
        System.out.println();
        
        list1.remove("type");
        list1.remove("data");
        list1.print();
        
        System.out.println();
        
        List<Integer> list2 = new List<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.print();
        System.out.println("7th node is: " + list2.getNthNodeData(7));
        
        System.out.println();
        
        list2.remove(5);
        list2.print();
    }
}
