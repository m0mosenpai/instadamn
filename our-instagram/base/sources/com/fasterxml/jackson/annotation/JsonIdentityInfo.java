package com.fasterxml.jackson.annotation;

import X.T2Y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonIdentityInfo {
    Class generator();

    String property() default "@id";

    Class resolver() default T2Y.class;

    Class scope() default Object.class;
}
