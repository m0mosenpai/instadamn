package com.facebook.rsys.calltag.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class CallTagApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(18);

    /* loaded from: classes9.dex */
    public final class CProxy extends CallTagApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallTagApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.calltag.gen.CallTagApi
        public native void updateCallTags(String str, long j, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CallTagApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void updateCallTags(String str, long j, String str2);
}
