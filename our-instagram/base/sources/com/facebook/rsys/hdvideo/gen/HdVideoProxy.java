package com.facebook.rsys.hdvideo.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class HdVideoProxy {
    public static C2N9 CONVERTER = C55648OnZ.A00(35);

    /* loaded from: classes9.dex */
    public final class CProxy extends HdVideoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native HdVideoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native boolean getHdVideoUserPreference();

        public native int hashCode();

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native void onVideoQualityChanged(Map map);

        @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
        public native void setApi(HdVideoApi hdVideoApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof HdVideoProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean getHdVideoUserPreference();

    public abstract void onVideoQualityChanged(Map map);

    public abstract void setApi(HdVideoApi hdVideoApi);
}
