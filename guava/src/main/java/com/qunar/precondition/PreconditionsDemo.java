package com.qunar.precondition;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {
    public static void main(String[] args) {
        int a = 1;
        Preconditions.checkArgument(a>2,"a应该大于1");
        Preconditions.checkPositionIndex(21,20);
        Integer x = null;
        Preconditions.checkNotNull(x,"x不能为空");
    }
}
