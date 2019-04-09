package org.coffeezcat.guava.collections.newtypes;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * @author yangweia
 * @title 双向Map
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class BiMapExample {
    @Test
    public void testHashBiMap(){
        BiMap<String,Integer> biMap = HashBiMap.create();
        biMap.put("one",1000);
        biMap.inverse().get(1000);
    }
}
