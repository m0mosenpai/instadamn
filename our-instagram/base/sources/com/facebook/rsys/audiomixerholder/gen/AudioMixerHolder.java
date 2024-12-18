package com.facebook.rsys.audiomixerholder.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class AudioMixerHolder {
    public static C2N9 CONVERTER = YAN.A00(11);

    /* loaded from: classes12.dex */
    public final class CProxy extends AudioMixerHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioMixerHolder createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.audiomixerholder.gen.AudioMixerHolder
        public native boolean isGeneric();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioMixerHolder)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean isGeneric();
}
