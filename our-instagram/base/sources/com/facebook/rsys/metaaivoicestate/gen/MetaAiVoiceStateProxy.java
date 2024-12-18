package com.facebook.rsys.metaaivoicestate.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class MetaAiVoiceStateProxy {
    public static C2N9 CONVERTER = YAM.A00(8);

    /* loaded from: classes12.dex */
    public final class CProxy extends MetaAiVoiceStateProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiVoiceStateProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onUpdate(MetaAiVoiceState metaAiVoiceState);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof MetaAiVoiceStateProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onUpdate(MetaAiVoiceState metaAiVoiceState);
}
