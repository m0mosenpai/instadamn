package com.facebook.rsys.devxagent.gen;

import X.C2N9;
import X.C55645OnW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public abstract class DevXAgentAppProxy {
    public static C2N9 CONVERTER = new C55645OnW();

    /* loaded from: classes.dex */
    public final class CProxy extends DevXAgentAppProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentAppProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void appCommand(String str);

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void startCall(DevXAgentCallStartParams devXAgentCallStartParams);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof DevXAgentAppProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void appCommand(String str);

    public abstract void startCall(DevXAgentCallStartParams devXAgentCallStartParams);
}
