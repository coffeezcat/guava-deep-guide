package org.coffeezcat.guava.basicutilities.avoidnull;

import com.google.common.base.Optional;

/**
 * @author coffeecat
 * @title guava-avoiding null
 * @date 2019年04月02日
 * @since v1.0.0
 */
public class Example {
    public static void main(String[] args) {
        Optional val = Optional.of(11);
        Optional<Integer> var1 = add(10,5);
        System.out.println(var1.get());

        Optional absent = Optional.absent();
        System.out.println(absent.or(10));
    }

    public static Optional<Integer> add(Integer a,Integer b){
        return Optional.of(a+b);
    }
}
