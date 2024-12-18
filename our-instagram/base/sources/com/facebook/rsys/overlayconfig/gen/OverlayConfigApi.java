package com.facebook.rsys.overlayconfig.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class OverlayConfigApi {

    /* loaded from: classes12.dex */
    public final class CProxy extends OverlayConfigApi {
        public final NativeHolder mNativeHolder;

        public static native OverlayConfigApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native boolean fetchParameterBoolean(int i, boolean z);

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native int fetchParameterInt32(int i, boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native void logExposure(int i);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof OverlayConfigApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean fetchParameterBoolean(int i, boolean z);

    public abstract int fetchParameterInt32(int i, boolean z);

    public abstract void logExposure(int i);
}
