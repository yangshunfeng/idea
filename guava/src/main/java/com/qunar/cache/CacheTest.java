package com.qunar.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.qunar.demo.User;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by shunfeng.yang on 2017/7/10.
 */
public class CacheTest {
    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String, User> loadingCache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterAccess(30, TimeUnit.MINUTES) //每个元素有效期
                .refreshAfterWrite(10, TimeUnit.MINUTES)
                .recordStats()
                .build(new CacheLoader<String, User>() {
                    @Override
                    public User load(String key) throws Exception {
                        return fetchUser(key);
                    }
                });
        User user = loadingCache.get("aaa");
        System.out.println(user);
        loadingCache.put("bbb",new User(2,"yang"));
    }

    private static User fetchUser(String key) {
        return new User(1, "");
    }
}
