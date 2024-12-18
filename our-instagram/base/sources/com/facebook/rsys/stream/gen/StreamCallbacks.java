package com.facebook.rsys.stream.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class StreamCallbacks {
    public static C2N9 CONVERTER = YAM.A00(54);

    /* loaded from: classes12.dex */
    public final class CProxy extends StreamCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.StreamCallbacks
        public native void onFailure(int i);

        @Override // com.facebook.rsys.stream.gen.StreamCallbacks
        public native void onSuccess();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof StreamCallbacks)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess();
}
