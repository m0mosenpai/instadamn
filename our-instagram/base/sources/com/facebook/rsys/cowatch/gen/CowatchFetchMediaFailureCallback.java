package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CowatchFetchMediaFailureCallback {

    /* loaded from: classes12.dex */
    public final class CProxy extends CowatchFetchMediaFailureCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchFetchMediaFailureCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchMediaFailureCallback
        public native void onFailure(String str, String str2, int i, String str3, String str4);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CowatchFetchMediaFailureCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(String str, String str2, int i, String str3, String str4);
}
