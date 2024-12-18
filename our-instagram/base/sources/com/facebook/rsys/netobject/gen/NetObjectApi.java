package com.facebook.rsys.netobject.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.realtimesession.gen.RealtimeSessionCreateParams;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class NetObjectApi {
    public static C2N9 CONVERTER = YAM.A00(14);

    /* loaded from: classes12.dex */
    public final class CProxy extends NetObjectApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.netobject.gen.NetObjectApi
        public native void createSession(TaskExecutor taskExecutor, RealtimeSessionCreateParams realtimeSessionCreateParams, NetObjectSessionCreationConfig netObjectSessionCreationConfig, NetObjectSessionCallback netObjectSessionCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetObjectApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void createSession(TaskExecutor taskExecutor, RealtimeSessionCreateParams realtimeSessionCreateParams, NetObjectSessionCreationConfig netObjectSessionCreationConfig, NetObjectSessionCallback netObjectSessionCallback);
}
