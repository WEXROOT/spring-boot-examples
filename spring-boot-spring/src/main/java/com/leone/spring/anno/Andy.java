package com.leone.spring.anno;

import java.lang.annotation.*;

/**
 * @author Leone
 * @since 2018-07-01
 **/
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Andy {

    String value() default "";

    String name() default "";

    int size() default 0;

}
