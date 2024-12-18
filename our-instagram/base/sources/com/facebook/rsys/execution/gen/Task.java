package com.facebook.rsys.execution.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class Task {
    public static C2N9 CONVERTER = YAN.A00(49);

    /* loaded from: classes12.dex */
    public final class CProxy extends Task {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native Task createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.Task
        public native void run();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Task)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void run();
}
