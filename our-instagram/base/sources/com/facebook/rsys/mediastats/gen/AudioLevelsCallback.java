package com.facebook.rsys.mediastats.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class AudioLevelsCallback {
    public static C2N9 CONVERTER = YAN.A00(70);

    /* loaded from: classes12.dex */
    public final class CProxy extends AudioLevelsCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioLevelsCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.mediastats.gen.AudioLevelsCallback
        public native void complete(Map map);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioLevelsCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(Map map);
}
