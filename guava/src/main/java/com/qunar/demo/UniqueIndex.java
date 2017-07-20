package com.qunar.demo;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

/**
 * Created by shunfeng.yang on 2017/7/10.
 */
public class UniqueIndex {
    public static void main(String[] args){
        List<User> users = Lists.newArrayList(new User(1,"hello"),new User(2,"yang"));
        Map<Integer,User> maps = Maps.uniqueIndex(users, new Function<User, Integer>() {
            @Nullable
            @Override
            public Integer apply(@Nullable User user) {
                Preconditions.checkNotNull(user);
                return user.getId();
            }
        });
        System.out.println(maps);
    }
}
