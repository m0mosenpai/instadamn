package com.facebook.rsys.networkinfo.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class NetworkInfoCallback {
    public static C2N9 CONVERTER = YAM.A00(21);

    /* loaded from: classes12.dex */
    public final class CProxy extends NetworkInfoCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetworkInfoCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoCallback
        public native void onUpdateRadioSignals(int i, Map map);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetworkInfoCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onUpdateRadioSignals(int i, Map map);
}
