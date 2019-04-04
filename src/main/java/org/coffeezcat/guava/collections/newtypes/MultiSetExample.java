package org.coffeezcat.guava.collections.newtypes;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author yangweia
 * @title 可以重复的元素
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class MultiSetExample {
    private final int SIZE=200;
    @Test
    public void testHashMultiset(){
        Multiset<Integer> multiset = HashMultiset.create();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i=0;i<SIZE;i++){
            multiset.add(random.nextInt(50));
        }
        System.out.println(multiset.count(10));
    }
}
