package com.facebook.rsys.perf.holders.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class PerfListenerFactory {

    /* loaded from: classes12.dex */
    public final class CProxy extends PerfListenerFactory {
        public final NativeHolder mNativeHolder;

        public static native PerfListenerFactory createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListenerFactory
        public native PerfListener createPerfListener(String str, String str2);

        public native int hashCode();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof PerfListenerFactory)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract PerfListener createPerfListener(String str, String str2);
}
