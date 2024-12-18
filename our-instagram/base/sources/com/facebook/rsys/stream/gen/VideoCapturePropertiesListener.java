package com.facebook.rsys.stream.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class VideoCapturePropertiesListener {
    public static C2N9 CONVERTER = YAM.A00(56);

    /* loaded from: classes12.dex */
    public final class CProxy extends VideoCapturePropertiesListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoCapturePropertiesListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.VideoCapturePropertiesListener
        public native void onResolutionChanged(int i, int i2);

        @Override // com.facebook.rsys.stream.gen.VideoCapturePropertiesListener
        public native void onTargetFpsChanged(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoCapturePropertiesListener)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onResolutionChanged(int i, int i2);

    public abstract void onTargetFpsChanged(int i);
}
