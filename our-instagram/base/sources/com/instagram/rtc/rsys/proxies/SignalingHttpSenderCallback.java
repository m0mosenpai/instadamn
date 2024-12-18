package com.instagram.rtc.rsys.proxies;

import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SignalingHttpSenderCallback {
    public static C2N9 CONVERTER = new C55647OnY(17);

    /* loaded from: classes9.dex */
    public final class CProxy extends SignalingHttpSenderCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingHttpSenderCallback createFromMcfType(McfReference mcfReference);

        public static native void gotHttpResponseJson(SignalingHttpSenderCallback signalingHttpSenderCallback, String str, int i);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback
        public native void gotHttpResponse(Map map, int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof SignalingHttpSenderCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void gotHttpResponse(Map map, int i);
}
