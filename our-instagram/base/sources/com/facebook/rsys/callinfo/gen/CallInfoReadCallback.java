package com.facebook.rsys.callinfo.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class CallInfoReadCallback {
    public static C2N9 CONVERTER = YAN.A00(22);

    /* loaded from: classes12.dex */
    public final class CProxy extends CallInfoReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallInfoReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.CallInfoReadCallback
        public native void complete(CallInfo callInfo, ArrayList arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CallInfoReadCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(CallInfo callInfo, ArrayList arrayList);
}
