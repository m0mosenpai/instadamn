package com.facebook.rsys.mosaicgrid.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class MosaicGridApi {
    public static C2N9 CONVERTER = YAM.A00(12);

    /* loaded from: classes12.dex */
    public final class CProxy extends MosaicGridApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MosaicGridApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.mosaicgrid.gen.MosaicGridApi
        public native void sendCurrentVideoSize(FrameSize frameSize);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof MosaicGridApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendCurrentVideoSize(FrameSize frameSize);
}
