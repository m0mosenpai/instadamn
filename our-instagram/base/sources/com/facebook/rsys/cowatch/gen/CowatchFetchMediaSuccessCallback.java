package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CowatchFetchMediaSuccessCallback {

    /* loaded from: classes12.dex */
    public final class CProxy extends CowatchFetchMediaSuccessCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchFetchMediaSuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchMediaSuccessCallback
        public native void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CowatchFetchMediaSuccessCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);
}
