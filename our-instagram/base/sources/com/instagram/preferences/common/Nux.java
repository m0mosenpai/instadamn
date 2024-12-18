package com.instagram.preferences.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;

@Target({ElementType.FIELD})
@Deprecated(message = "Use BoolNux or IntNux instead")
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface Nux {
    boolean getBooleanAlwaysReturn() default true;

    int getIntAlwaysReturn() default 100;
}
