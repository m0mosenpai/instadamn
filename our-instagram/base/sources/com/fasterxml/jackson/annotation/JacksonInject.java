package com.fasterxml.jackson.annotation;

import X.EnumC61058ReX;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JacksonInject {
    EnumC61058ReX useInput() default EnumC61058ReX.A00;

    String value() default "";
}
