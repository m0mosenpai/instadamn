package com.fasterxml.jackson.annotation;

import X.C45V;
import X.EnumC61058ReX;
import X.EnumC61060ReZ;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface JsonFormat {
    EnumC61058ReX lenient() default EnumC61058ReX.A00;

    String locale() default "##default";

    String pattern() default "";

    C45V shape() default C45V.ANY;

    String timezone() default "##default";

    EnumC61060ReZ[] with() default {};

    EnumC61060ReZ[] without() default {};
}
