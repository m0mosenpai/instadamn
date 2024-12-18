package com.facebook.rsys.videorender.gen;

import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class VideoRenderFrameCallback {
    public static C2N9 CONVERTER = new YAL(9);

    /* loaded from: classes12.dex */
    public final class CProxy extends VideoRenderFrameCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderFrameCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderFrameCallback
        public native void onFrame(RSVideoFrame rSVideoFrame, int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoRenderFrameCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFrame(RSVideoFrame rSVideoFrame, int i);
}
