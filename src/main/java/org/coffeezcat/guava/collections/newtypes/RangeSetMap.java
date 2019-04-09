package org.coffeezcat.guava.collections.newtypes;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import org.junit.Test;

/**
 * @author yangweia
 * @title
 * @date 2019年04月08日
 * @since v1.0.0
 */
public class RangeSetMap {
    @Test
    public void testRangeSetMap(){
        RangeMap<Integer,String> setMap = TreeRangeMap.create();
        setMap.put(Range.closed(1, 10), "foo");
        System.out.println(setMap.get(5));

    }
}
