/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Idel
 */
public class Tree {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(0));
        System.out.println(treeSet.contains(4));
        System.out.println(treeSet.descendingSet());
        treeSet2 = (TreeSet) treeSet.clone();
        System.out.println("Cloned Set: " + treeSet2);

        Iterator iterator;
        iterator = treeSet2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        try {
            System.out.println("\n" + treeSet.comparator());
            System.out.println(treeSet.isEmpty());
            System.out.println(treeSet.remove(6));
            System.out.println(treeSet);
            System.out.println(treeSet.first());
            System.out.println(treeSet.last());
            System.out.println(treeSet.pollFirst());
            System.out.println(treeSet.pollLast());
            System.out.println(treeSet.higher(5));

            System.out.println(treeSet);
        } catch (Exception e) {
            System.out.println("This is broken!");

        }
//        System.out.println(treeSet.containsKey(1));
        //nasty path
         System.out.println("----------------------------------------------------");
//                    treeSet.add(5.5);
//                    System.out.println(treeSet.ceiling(5.5));
//                    System.out.println(treeSet.ceiling(7));
//        treeSet.add(null);
//        treeSet.add("NASTY");
//        System.out.println(treeSet.higher(null));
//          System.out.println(treeSet.higher(6));
        TreeSet treeSet3 = new TreeSet();
//        System.out.println(treeSet3.pollFirst());
//        System.out.println(treeSet3.pollLast());
         System.out.println(treeSet3.remove(2));
        System.out.println(treeSet);

        treeSet.clear();

    }

}
