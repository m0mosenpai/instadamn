package com.facebook.rsys.netobject.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class NetObjectSessionCallback {
    public static C2N9 CONVERTER = YAM.A00(17);

    /* loaded from: classes12.dex */
    public final class CProxy extends NetObjectSessionCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectSessionCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionCallback
        public native void onCreated(NetObjectSession netObjectSession);

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionCallback
        public native void onError();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetObjectSessionCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCreated(NetObjectSession netObjectSession);

    public abstract void onError();
}
