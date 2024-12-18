package com.facebook.rsys.videorender.gen;

import X.C2N9;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes11.dex */
public abstract class VideoRenderProxy {
    public static C2N9 CONVERTER = new WV3(5);

    /* loaded from: classes11.dex */
    public final class CProxy extends VideoRenderProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void setApi(VideoRenderApi videoRenderApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoRenderProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

    public abstract void setApi(VideoRenderApi videoRenderApi);
}
