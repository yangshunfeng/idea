package com.qunar.optional;

import com.google.common.base.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(1);
        System.out.println(optional.get());
    }
}
