package com.facebook.rsys.netobject.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class RawDataListener {
    public static C2N9 CONVERTER = YAM.A00(20);

    /* loaded from: classes12.dex */
    public final class CProxy extends RawDataListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native RawDataListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.netobject.gen.RawDataListener
        public native void onDataReceived(String str, byte[] bArr);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof RawDataListener)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onDataReceived(String str, byte[] bArr);
}
