package com.facebook.rsys.callintent.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CallIntentFactory {

    /* loaded from: classes12.dex */
    public final class CProxy extends CallIntentFactory {
        public final NativeHolder mNativeHolder;

        public static native CallIntentFactory createFromMcfType(McfReference mcfReference);

        public static native CallIntentFactory createInstance(TaskExecutor taskExecutor, CallIntentFactoryListener callIntentFactoryListener, PerfListenerFactory perfListenerFactory);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void asyncDestroyForSigcoreUseOnly();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void destroy();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native PerfLoggerHolder getPerfLogger(String str, String str2);

        public native int hashCode();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void registerUser(SignalingUserContext signalingUserContext);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void unregisterUser(String str, String str2);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CallIntentFactory)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void asyncDestroyForSigcoreUseOnly();

    public abstract CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

    public abstract void destroy();

    public abstract PerfLoggerHolder getPerfLogger(String str, String str2);

    public abstract void registerUser(SignalingUserContext signalingUserContext);

    public abstract void unregisterUser(String str, String str2);
}
