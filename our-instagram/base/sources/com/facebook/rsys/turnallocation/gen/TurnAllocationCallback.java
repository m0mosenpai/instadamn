package com.facebook.rsys.turnallocation.gen;

import X.C2N9;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes11.dex */
public abstract class TurnAllocationCallback {
    public static C2N9 CONVERTER = new WV3(3);

    /* loaded from: classes11.dex */
    public final class CProxy extends TurnAllocationCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TurnAllocationCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationCallback
        public native void error(String str, int i);

        public native int hashCode();

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationCallback
        public native void success(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof TurnAllocationCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void error(String str, int i);

    public abstract void success(String str);
}
