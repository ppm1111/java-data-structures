package test_area;

import calculate.Calculator;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator c = new Calculator(1, 3);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
        System.out.println(c.mod());
    }

}
