package com.facebook.rsys.crypto.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CryptoProxy {
    public static C2N9 CONVERTER = YAN.A00(39);

    /* loaded from: classes12.dex */
    public final class CProxy extends CryptoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CryptoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.crypto.gen.CryptoProxy
        public native void setApi(CryptoApi cryptoApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CryptoProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setApi(CryptoApi cryptoApi);
}