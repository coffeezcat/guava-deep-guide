package org.coffeezcat.guava.basicutilities.preconditions;

import com.google.common.base.Preconditions;

/**
 * @author yangweia
 * @title
 * @date 2019年04月03日
 * @since v1.0.0
 */
public class Example {
    public static void main(String[] args) {
        int i = 9,j=11;
        Preconditions.checkArgument(i>11,"%s must greater than %s",i,j);
    }
}
