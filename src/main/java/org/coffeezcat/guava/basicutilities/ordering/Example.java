package org.coffeezcat.guava.basicutilities.ordering;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author yangweia
 * @title
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class Example {


    private static List<String> var1 = Arrays.asList("mary","jack.ma","cocoer",null,"kangkang","idea","pyCharm");

    /**
     *基本用法--按字符串长度排序
     * */
    @Test
    public void testBaseUse(){
        Ordering<String> byLengthOrdering = new Ordering<String>() {
            @Override
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
        List<String> var1 = Arrays.asList("mary","jack.ma","cocoer","kangkang","idea","pyCharm");
        Collections.sort(var1,byLengthOrdering);
        System.out.println(var1);
    }

    /**
     * 进阶用法
     * */
    @Test
    public void testOrdering(){
       List<String> var1 = Arrays.asList("mary","jack.ma","cocoer",null,"kangkang","idea","pyCharm");
        Ordering<String> ordering = Ordering.natural().reverse().nullsFirst().onResultOf(new Function<String, Comparable>() {
            @Override
            public Comparable apply(@Nullable String input) {
                //用来比较的字段
                return Objects.isNull(input)?input:input.charAt(input.length()-1);
            }
        });
        Collections.sort(var1,ordering);
        System.out.println(var1);
    }


    /**
     * 测试应用
     * */
    @Test
    public void testApplication(){
        List<Integer> var2 = randoms(20);
        System.out.println(var2);
        //获取排序前20的元素
        List<Integer> var3 = Ordering.natural().greatestOf(var2,20);
        System.out.println(var3);
        int min = Ordering.natural().min(var2);
        System.out.println(min);
    }


    private static List<Integer> randoms(int size){
        List<Integer> integers = new ArrayList<>(size);
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        for (int i=0;i<size;i++){
            integers.add(threadLocalRandom.nextInt(900));
        }
        return integers;
    }
}
