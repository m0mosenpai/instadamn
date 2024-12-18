package com.facebook.rsys.crypto.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class CryptoApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(24);

    /* loaded from: classes9.dex */
    public final class CProxy extends CryptoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CryptoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackNewDeviceNotifications(ArrayList arrayList);

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackUiDisplayedParticipantIds(ArrayList arrayList);

        public native int hashCode();

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void setE2eeMode(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CryptoApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void ackNewDeviceNotifications(ArrayList arrayList);

    public abstract void ackUiDisplayedParticipantIds(ArrayList arrayList);

    public abstract void setE2eeMode(int i);
}
