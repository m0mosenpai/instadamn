package com.fasterxml.jackson.annotation;

import X.EnumC61124Rfe;
import X.EnumC61152RgD;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface JsonTypeInfo {
    Class defaultImpl() default JsonTypeInfo.class;

    EnumC61124Rfe include() default EnumC61124Rfe.PROPERTY;

    String property() default "";

    EnumC61152RgD use();

    boolean visible() default false;
}
