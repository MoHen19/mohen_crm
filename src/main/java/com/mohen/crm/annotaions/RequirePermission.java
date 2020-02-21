package com.mohen.crm.annotaions;

import java.lang.annotation.*;

/**
 * @author MH19
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequirePermission {

    String code() default "";

}
