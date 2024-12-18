package com.facebook.rsys.tslog.gen;

import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class TslogStreamApi {
    public static C2N9 CONVERTER = new YAL(0);

    /* loaded from: classes12.dex */
    public final class CProxy extends TslogStreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogStreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogStreamApi
        public native TslogCounterApi createCounter(String str, int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof TslogStreamApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract TslogCounterApi createCounter(String str, int i);
}
