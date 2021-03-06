package com.leone.boot.common.design.structure.decorator;

/**
 * @author leone
 * @since 2018-08-01
 **/
public class DecoratorTest {

    public static void main(String[] args) {

        Drinks drinks = new Coke();
        System.out.println(drinks.name + drinks.price());

        drinks = new IceDecorator(drinks);

        System.out.println(drinks.getName() + drinks.price());


    }


}
