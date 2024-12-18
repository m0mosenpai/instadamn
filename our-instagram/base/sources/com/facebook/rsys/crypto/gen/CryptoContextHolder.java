package com.facebook.rsys.crypto.gen;

import X.C2N9;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class CryptoContextHolder {
    public static C2N9 CONVERTER = new C2N9() { // from class: X.5yU
        @Override // X.C2N9
        public final Class BUQ() {
            return CryptoContextHolder.class;
        }

        @Override // X.C2N9
        public final long CBx() {
            long j = CryptoContextHolder.sMcfTypeId;
            if (j == 0) {
                long nativeGetMcfTypeId = CryptoContextHolder.nativeGetMcfTypeId();
                CryptoContextHolder.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            }
            return j;
        }

        @Override // X.C2N9
        public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
            return CryptoContextHolder.createFromMcfType(mcfReference);
        }
    };
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native CryptoContextHolder createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(McfReference mcfReference);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native McfReference getContext();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof CryptoContextHolder)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public CryptoContextHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.mNativeHolder = initNativeHolder(mcfReference);
    }

    public CryptoContextHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
