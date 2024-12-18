package com.facebook.rsys.callintent.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class IncomingCallInfo {
    public final NativeHolder mNativeHolder;

    public static native IncomingCallInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, McfReference mcfReference, CallMetadata callMetadata, String str2, String str3, Long l);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native CallMetadata getCallMetadata();

    public native Long getIncomingInviteServerTime();

    public native String getIncomingInviteTransactionId();

    public native McfReference getMessageContext();

    public native String getReceiverId();

    public native String getSharedCallIdentifier();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof IncomingCallInfo)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public IncomingCallInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public IncomingCallInfo(String str, McfReference mcfReference, CallMetadata callMetadata, String str2, String str3, Long l) {
        str.getClass();
        str3.getClass();
        this.mNativeHolder = initNativeHolder(str, mcfReference, callMetadata, str2, str3, l);
    }
}
