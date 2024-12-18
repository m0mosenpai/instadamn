package com.fasterxml.jackson.databind.annotation;

import X.AbstractC64180T2m;
import X.EnumC61059ReY;
import X.EnumC61070Rek;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface JsonSerialize {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default AbstractC64180T2m.class;

    Class contentUsing() default JsonSerializer.None.class;

    Class converter() default AbstractC64180T2m.class;

    @Deprecated
    EnumC61070Rek include() default EnumC61070Rek.DEFAULT_INCLUSION;

    Class keyAs() default Void.class;

    Class keyUsing() default JsonSerializer.None.class;

    Class nullsUsing() default JsonSerializer.None.class;

    EnumC61059ReY typing() default EnumC61059ReY.A00;

    Class using() default JsonSerializer.None.class;
}
