package com.fasterxml.jackson.annotation;

import X.C45I;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonInclude {
    C45I content() default C45I.ALWAYS;

    Class contentFilter() default Void.class;

    C45I value() default C45I.ALWAYS;

    Class valueFilter() default Void.class;
}
