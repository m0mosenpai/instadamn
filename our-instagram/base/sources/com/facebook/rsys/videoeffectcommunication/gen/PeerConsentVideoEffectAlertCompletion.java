package com.facebook.rsys.videoeffectcommunication.gen;

import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class PeerConsentVideoEffectAlertCompletion {
    public static C2N9 CONVERTER = new YAL(5);

    /* loaded from: classes12.dex */
    public final class CProxy extends PeerConsentVideoEffectAlertCompletion {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PeerConsentVideoEffectAlertCompletion createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videoeffectcommunication.gen.PeerConsentVideoEffectAlertCompletion
        public native void onConfirmation(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof PeerConsentVideoEffectAlertCompletion)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onConfirmation(boolean z);
}
