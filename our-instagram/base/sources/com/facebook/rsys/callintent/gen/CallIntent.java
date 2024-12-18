package com.facebook.rsys.callintent.gen;

import X.AbstractC31180DnO;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class CallIntent {
    public final NativeHolder mNativeHolder;

    public static native CallIntent createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, CallContext callContext, OutgoingCallConfig outgoingCallConfig, IncomingCallInfo incomingCallInfo, Object obj, Long l, String str3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getAppId();

    public native CallContext getCallContext();

    public native Long getConnectionId();

    public native String getConnectionLoggingId();

    public native IncomingCallInfo getIncomingCallInfo();

    public native String getLocalCallId();

    public native OutgoingCallConfig getOutgoingCallConfig();

    public native Object getSignalingSessionHolder();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof CallIntent)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public CallIntent(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public CallIntent(String str, String str2, CallContext callContext, OutgoingCallConfig outgoingCallConfig, IncomingCallInfo incomingCallInfo, Object obj, Long l, String str3) {
        AbstractC31180DnO.A1U(str, str2, callContext);
        this.mNativeHolder = initNativeHolder(str, str2, callContext, outgoingCallConfig, incomingCallInfo, obj, l, str3);
    }
}
