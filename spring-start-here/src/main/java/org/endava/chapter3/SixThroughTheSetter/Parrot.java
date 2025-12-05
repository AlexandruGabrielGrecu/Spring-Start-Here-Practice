package org.endava.chapter3.SixThroughTheSetter;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "koko";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    /**
     * Why is this approach not desired in production code?
     * It’s not totally wrong to use it, but you want to make sure you make your app maintainable and testable in production code.
     * By injecting the value directly in the field:
     *
     * you don’t have the option to make the field final (see next code snippet),
     * and this way, make sure no one can change its value after initialization:
     */
}
