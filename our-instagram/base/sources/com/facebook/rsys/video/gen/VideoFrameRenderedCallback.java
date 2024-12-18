package com.facebook.rsys.video.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class VideoFrameRenderedCallback {

    /* loaded from: classes12.dex */
    public final class CProxy extends VideoFrameRenderedCallback {
        public final NativeHolder mNativeHolder;

        public static native VideoFrameRenderedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.video.gen.VideoFrameRenderedCallback
        public native void onCallbackRegistered();

        @Override // com.facebook.rsys.video.gen.VideoFrameRenderedCallback
        public native void onFrameRendered(RSVideoFrame rSVideoFrame);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoFrameRenderedCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCallbackRegistered();

    public abstract void onFrameRendered(RSVideoFrame rSVideoFrame);
}
