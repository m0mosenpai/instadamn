package com.facebook.rsys.realtimesession.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class RealtimeSessionManagerApi {
    public static C2N9 CONVERTER = YAM.A00(43);

    /* loaded from: classes12.dex */
    public final class CProxy extends RealtimeSessionManagerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native RealtimeSessionManagerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.realtimesession.gen.RealtimeSessionManagerApi
        public native void useFromCppOnly();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof RealtimeSessionManagerApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void useFromCppOnly();
}
