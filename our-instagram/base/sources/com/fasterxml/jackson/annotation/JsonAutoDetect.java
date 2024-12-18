package com.fasterxml.jackson.annotation;

import X.C45N;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonAutoDetect {
    C45N creatorVisibility() default C45N.DEFAULT;

    C45N fieldVisibility() default C45N.DEFAULT;

    C45N getterVisibility() default C45N.DEFAULT;

    C45N isGetterVisibility() default C45N.DEFAULT;

    C45N setterVisibility() default C45N.DEFAULT;
}
