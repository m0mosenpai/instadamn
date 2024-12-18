package com.facebook.rsys.devxcallagent.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class DevXAgentCallApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(28);

    /* loaded from: classes9.dex */
    public final class CProxy extends DevXAgentCallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentCallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi
        public native DevXAgentCallConfig copyCallConfig(String str);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof DevXAgentCallApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DevXAgentCallConfig copyCallConfig(String str);
}
