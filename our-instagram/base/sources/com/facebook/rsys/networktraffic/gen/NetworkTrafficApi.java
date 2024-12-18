package com.facebook.rsys.networktraffic.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class NetworkTrafficApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(62);

    /* loaded from: classes9.dex */
    public final class CProxy extends NetworkTrafficApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetworkTrafficApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventComplete(long j, HttpStats httpStats);

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventResponse(long j);

        @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficApi
        public native void onHttpEventStart(long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetworkTrafficApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onHttpEventComplete(long j, HttpStats httpStats);

    public abstract void onHttpEventResponse(long j);

    public abstract void onHttpEventStart(long j);
}
