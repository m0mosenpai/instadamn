package com.facebook.rsys.networktraffic.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class NetworkTrafficProxy {
    public static C2N9 CONVERTER = YAM.A00(23);

    /* loaded from: classes12.dex */
    public final class CProxy extends NetworkTrafficProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetworkTrafficProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
        public native void onCallEnd();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
        public native void onCallStart();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetworkTrafficProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCallEnd();

    public abstract void onCallStart();
}
