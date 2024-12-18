package com.facebook.rsys.transport.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class MessageReceiveCallbacks {
    public static C2N9 CONVERTER = YAM.A00(60);

    /* loaded from: classes12.dex */
    public final class CProxy extends MessageReceiveCallbacks {
        public static long A00;
        public final NativeHolder mNativeHolder;

        public static native MessageReceiveCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.MessageReceiveCallbacks
        public native void onError(int i, String str);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof MessageReceiveCallbacks)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onError(int i, String str);
}
