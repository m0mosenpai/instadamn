package com.fasterxml.jackson.annotation;

import X.C45K;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonSetter {
    C45K contentNulls() default C45K.DEFAULT;

    C45K nulls() default C45K.DEFAULT;

    String value() default "";
}
