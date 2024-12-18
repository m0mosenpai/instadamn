package com.fasterxml.jackson.databind.annotation;

import X.AbstractC64180T2m;
import X.R9S;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface JsonDeserialize {
    Class as() default Void.class;

    Class builder() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default AbstractC64180T2m.class;

    Class contentUsing() default JsonDeserializer.None.class;

    Class converter() default AbstractC64180T2m.class;

    Class keyAs() default Void.class;

    Class keyUsing() default R9S.class;

    Class using() default JsonDeserializer.None.class;
}
