package com.facebook.rsys.reactions.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class ReactionsApi {
    public static C2N9 CONVERTER = YAM.A00(41);

    /* loaded from: classes12.dex */
    public final class CProxy extends ReactionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ReactionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.reactions.gen.ReactionsApi
        public native void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

        @Override // com.facebook.rsys.reactions.gen.ReactionsApi
        public native void setAllowedGifDomains(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof ReactionsApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

    public abstract void setAllowedGifDomains(ArrayList arrayList);
}
