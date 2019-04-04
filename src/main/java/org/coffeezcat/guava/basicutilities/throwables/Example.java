package org.coffeezcat.guava.basicutilities.throwables;

import com.google.common.base.Throwables;
import org.junit.Test;

import java.io.IOException;
import java.nio.channels.AlreadyBoundException;
import java.sql.SQLException;

/**
 * @author yangweia
 * @title
 * @date 2019年04月04日
 * @since v1.0.0
 */
public class Example {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println(String.class.isInstance("xxx"));
            System.out.println("xxxx" instanceof  String);
            someMethodThatCouldThrowAnything();
        } catch (IllegalArgumentException e) {
        } catch (Throwable t) {
            Throwables.propagateIfInstanceOf(t, IOException.class);
            Throwables.propagateIfInstanceOf(t, SQLException.class);
            throw Throwables.propagate(t);
        }
    }

    private static void someMethodThatCouldThrowAnything(){
        throw new AlreadyBoundException();
    }




}
