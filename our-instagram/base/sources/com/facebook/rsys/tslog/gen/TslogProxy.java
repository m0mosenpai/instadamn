package com.facebook.rsys.tslog.gen;

import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class TslogProxy {
    public static C2N9 CONVERTER = new C55647OnY(0);

    /* loaded from: classes9.dex */
    public final class CProxy extends TslogProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.tslog.gen.TslogProxy
        public native void setApi(TslogApi tslogApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof TslogProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setApi(TslogApi tslogApi);
}
