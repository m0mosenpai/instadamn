package com.facebook.rsys.devxagent.gen;

import X.C09170dP;
import X.C2N9;
import X.C2NC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class DevXAgentApi {
    public static C2N9 CONVERTER = new C2N9() { // from class: X.2N7
        @Override // X.C2N9
        public final Class BUQ() {
            return DevXAgentApi.class;
        }

        @Override // X.C2N9
        public final long CBx() {
            long j = DevXAgentApi.CProxy.sMcfTypeId;
            if (j == 0) {
                long nativeGetMcfTypeId = DevXAgentApi.CProxy.nativeGetMcfTypeId();
                DevXAgentApi.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            }
            return j;
        }

        @Override // X.C2N9
        public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
            return DevXAgentApi.CProxy.createFromMcfType(mcfReference);
        }
    };

    /* loaded from: classes.dex */
    public final class CProxy extends DevXAgentApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentApi createApi();

        public static native DevXAgentApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet hashSet);

        static {
            if (!C2NC.A00) {
                Execution.initialize();
                C09170dP.A0C("jniperflogger");
                C09170dP.A0C("rsdevxagentjni");
                C2NC.A00 = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof DevXAgentApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet hashSet);
}
