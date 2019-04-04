package org.coffeezcat.guava.collections.immutable;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

/**
 * @author yangweia
 * @title集合-不可变对象
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class Example {
    @Test
    public void testImmutableSet(){
        ImmutableSet<String> immutableSet =  ImmutableSet.of("one","two");
    }
}
