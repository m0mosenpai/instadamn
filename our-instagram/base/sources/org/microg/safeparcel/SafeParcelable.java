package org.microg.safeparcel;

import android.os.Parcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes10.dex */
public interface SafeParcelable extends Parcelable {

    @Deprecated
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    @Deprecated
    public static final int SAFE_PARCEL_MAGIC = 20293;
    public static final int SAFE_PARCEL_OBJECT_MAGIC = 20293;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes10.dex */
    public @interface Field {
        boolean mayNull() default false;

        Class subClass() default SafeParcelable.class;

        boolean useValueParcel() default false;

        int value();

        long versionCode() default -1;
    }
}
