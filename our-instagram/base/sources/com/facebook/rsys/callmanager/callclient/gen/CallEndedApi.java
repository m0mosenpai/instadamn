package com.facebook.rsys.callmanager.callclient.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class CallEndedApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(12);

    /* loaded from: classes9.dex */
    public final class CProxy extends CallEndedApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallEndedApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallEndedApi
        public native void removeCall();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CallEndedApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void removeCall();
}
