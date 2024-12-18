package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class LoggingOption {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getInstanceIdNative(long j);

    private native Number getLocalDataIdNative(long j);

    private native Integer getMessageSourceNative(long j);

    private native String getNavigationChainNative(long j);

    private native PrivacyContext getPrivacyContextNative(long j);

    private native String getSendAttributionNative(long j);

    private native boolean getShouldStartHealthReportNative(long j);

    private native TraceInfo getTraceInfoNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LoggingOption)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((LoggingOption) obj).mNativeHolder.mNativePointer);
        }
        return false;
    }

    public TraceInfo getTraceInfo() {
        return getTraceInfoNative(this.mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    static {
        C53882dS.A00();
    }

    public LoggingOption(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public LoggingOption(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2) {
        this.mNativeHolder = initNativeHolder(null, traceInfo, null, null, null, null, false, null);
    }
}
