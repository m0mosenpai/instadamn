package com.facebook.rsys.starrating.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class StarRatingApi {
    public static C2N9 CONVERTER = YAM.A00(50);

    /* loaded from: classes12.dex */
    public final class CProxy extends StarRatingApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StarRatingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void dismissStarRating();

        public native int hashCode();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void onUserInteraction();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void submitStarRating(int i, String str, Long l);

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void submitStarRatingShown(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof StarRatingApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void dismissStarRating();

    public abstract void onUserInteraction();

    public abstract void submitStarRating(int i, String str, Long l);

    public abstract void submitStarRatingShown(int i);
}
