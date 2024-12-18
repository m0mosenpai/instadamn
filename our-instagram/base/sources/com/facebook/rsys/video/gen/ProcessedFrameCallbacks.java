package com.facebook.rsys.video.gen;

import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class ProcessedFrameCallbacks {
    public static C2N9 CONVERTER = new YAL(2);

    /* loaded from: classes12.dex */
    public final class CProxy extends ProcessedFrameCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ProcessedFrameCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.video.gen.ProcessedFrameCallbacks
        public native void onFrameReady(RSVideoFrame rSVideoFrame);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof ProcessedFrameCallbacks)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFrameReady(RSVideoFrame rSVideoFrame);
}
