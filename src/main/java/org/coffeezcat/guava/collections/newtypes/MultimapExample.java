package org.coffeezcat.guava.collections.newtypes;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.sun.org.apache.xpath.internal.operations.Mult;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangweia
 * @title 可以保存重复的key=>val1,val2
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class MultimapExample {
    @Test
    public void testMultiMap(){
        Multimap<String,String> multimap = ArrayListMultimap.create();
        multimap.put("one","one");
        multimap.put("one","two");
        multimap.put("one","two");
        Collection<String> list =  multimap.get("one");
        Iterator  it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
