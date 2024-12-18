package com.facebook.rsys.grid.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class GridApi {
    public static C2N9 CONVERTER = YAN.A00(53);

    /* loaded from: classes12.dex */
    public final class CProxy extends GridApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GridApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void performPinningAction(String str, int i);

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void unpinAll();

        @Override // com.facebook.rsys.grid.gen.GridApi
        public native void updateMaxPeersVisible(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof GridApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void performPinningAction(String str, int i);

    public abstract void unpinAll();

    public abstract void updateMaxPeersVisible(int i);
}
