package org.coffeezcat.guava.collections.newtypes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;
import sun.security.provider.certpath.Vertex;

/**
 * @author yangweia
 * @title
 * @date 2019年04月08日
 * @since v1.0.0
 */
public class TableExample {
    @Test
    public void testTable(){
        Table<Integer, Integer, String> weightedGraph = HashBasedTable.create();
        weightedGraph.put(1,1,"1-1");
        weightedGraph.put(1,2,"1-2");
        weightedGraph.put(2,1,"2-1");
        System.out.println(weightedGraph.get(1,1));
    }

}
