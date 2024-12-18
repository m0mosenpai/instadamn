package com.facebook.rsys.avatarcommunication.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class AvatarCommunicationProxy {
    public static C2N9 CONVERTER = YAN.A00(15);

    /* loaded from: classes12.dex */
    public final class CProxy extends AvatarCommunicationProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AvatarCommunicationProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
        public native void fetchAvatarPresetAssets();

        @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
        public native void fetchCodecAvatarSurveyEligibility();

        public native int hashCode();

        @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
        public native void onAvatarsUsedInCall();

        @Override // com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy
        public native void setApi(AvatarCommunicationApi avatarCommunicationApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AvatarCommunicationProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void fetchAvatarPresetAssets();

    public abstract void fetchCodecAvatarSurveyEligibility();

    public abstract void onAvatarsUsedInCall();

    public abstract void setApi(AvatarCommunicationApi avatarCommunicationApi);
}
