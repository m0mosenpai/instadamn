package com.fasterxml.jackson.annotation;

import X.EnumC61114RfU;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface JsonCreator {
    EnumC61114RfU mode() default EnumC61114RfU.DEFAULT;
}
