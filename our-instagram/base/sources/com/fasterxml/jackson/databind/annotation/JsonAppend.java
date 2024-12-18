package com.fasterxml.jackson.databind.annotation;

import X.C45I;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonAppend {

    /* loaded from: classes10.dex */
    public @interface Attr {
        C45I include() default C45I.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* JADX WARN: Method from annotation default annotation not found: include */
    /* JADX WARN: Method from annotation default annotation not found: required */
    /* loaded from: classes10.dex */
    public @interface Prop {
        String name() default "";

        String namespace() default "";

        Class type() default Object.class;

        Class value();
    }

    Attr[] attrs() default {};

    boolean prepend() default false;

    Prop[] props() default {};
}
