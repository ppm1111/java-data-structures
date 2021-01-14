package test_area;

import java.util.Arrays;

import calculate.Calculator;
import sort.BubbleSort;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator c = new Calculator(1, 3);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
        System.out.println(c.mod());
        
        // bubble sort
        int[] a = {3,4,5,56,67,8,4,32,2,34,5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
        
    }

}
