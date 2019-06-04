package org.coffeezcat.guava.collections.tools;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author coffezcat
 * @title: JoinerExample
 * @description: TODO
 * @date 2019/6/4 16:39
 */
public class JoinerExample {
      @Test
      public void joinList(){
          List<String> list = Lists.newArrayList("小杨","小黄","王二小");
          String str =  Joiner.on(",").join(list);
          System.out.println(str);
      }

      @Test
      public void joinMap(){
          Map<String,Integer> map = Maps.newLinkedHashMap();
          map.put("小杨",20);
          map.put("小黄",21);
          map.put("王二小",22);
          String str=Joiner.on(",").withKeyValueSeparator("=").join(map);
          System.out.println(str);
      }
}
