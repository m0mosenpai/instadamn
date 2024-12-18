package com.facebook.rsys.perf.holders.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class PerfListener {

    /* loaded from: classes12.dex */
    public final class CProxy extends PerfListener {
        public final NativeHolder mNativeHolder;

        public static native PerfListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListener
        public native void onMarkerStart(String str, String str2);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof PerfListener)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onMarkerStart(String str, String str2);
}
