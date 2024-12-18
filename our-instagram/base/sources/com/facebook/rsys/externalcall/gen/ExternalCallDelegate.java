package com.facebook.rsys.externalcall.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class ExternalCallDelegate {
    public static C2N9 CONVERTER = C55648OnZ.A00(30);

    /* loaded from: classes9.dex */
    public final class CProxy extends ExternalCallDelegate {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ExternalCallDelegate createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.externalcall.gen.ExternalCallDelegate
        public native void onExternalCallStarted();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof ExternalCallDelegate)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onExternalCallStarted();
}
