package com.facebook.rsys.starrating.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class StarRatingModel {
    public static C2N9 CONVERTER = YAM.A00(51);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native StarRatingModel createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, boolean z, int i2, String str, int i3, int i4, Long l);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getBlackboxTraceId();

    public native int getCallEndDelayAfterRatingSeconds();

    public native Long getRatingStyle();

    public native int getShouldShowStarRating();

    public native int getStarRating();

    public native boolean getStarRatingRecorded();

    public native int getThresholdForSurvey();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof StarRatingModel)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public StarRatingModel(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public StarRatingModel(int i, boolean z, int i2, String str, int i3, int i4, Long l) {
        this.mNativeHolder = initNativeHolder(i, z, i2, str, i3, i4, l);
    }
}
