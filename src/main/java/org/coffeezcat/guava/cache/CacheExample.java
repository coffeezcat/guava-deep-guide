package org.coffeezcat.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * @author yangweia
 * @title
 * @date 2019年04月09日
 * @since v1.0.0
 */
public class CacheExample {
    public static void main(String[] args)throws Exception {
        LoadingCache<String,String> cache =  CacheBuilder.newBuilder().maximumSize(100)
                .expireAfterAccess(2, TimeUnit.SECONDS)
                .build(
                new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println("--------");
                        return null;
                    }
                }
        );

        cache.put("key1","val");
        System.out.println(cache.getUnchecked("key1"));
        Thread.sleep(3000);
        System.out.println(cache.getUnchecked("key1"));
    }
}
