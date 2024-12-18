package com.facebook.rsys.camera.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CameraStallHandler {
    public static C2N9 CONVERTER = YAN.A00(29);

    /* loaded from: classes12.dex */
    public final class CProxy extends CameraStallHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraStallHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallDetected();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallRecovered();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CameraStallHandler)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCameraStallDetected();

    public abstract void onCameraStallRecovered();
}
