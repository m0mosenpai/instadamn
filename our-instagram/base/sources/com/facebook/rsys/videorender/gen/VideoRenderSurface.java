package com.facebook.rsys.videorender.gen;

import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class VideoRenderSurface {
    public static C2N9 CONVERTER = new YAL(11);

    /* loaded from: classes12.dex */
    public final class CProxy extends VideoRenderSurface {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderSurface createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void addRenderItem(VideoRenderItem videoRenderItem);

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void removeRenderItem(String str, StreamInfo streamInfo);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void setRenderItems(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoRenderSurface)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addRenderItem(VideoRenderItem videoRenderItem);

    public abstract void removeRenderItem(String str, StreamInfo streamInfo);

    public abstract void setRenderItems(ArrayList arrayList);
}
