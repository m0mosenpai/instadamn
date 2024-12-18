package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class TraceInfo {
    public static final TraceInfo $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native String getTraceIdNative(long j);

    private native Integer getTraceTypeNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, String str);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof TraceInfo)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((TraceInfo) obj).mNativeHolder.mNativePointer);
        }
        return false;
    }

    public String getTraceId() {
        return getTraceIdNative(this.mNativeHolder.mNativePointer);
    }

    public Integer getTraceType() {
        return getTraceTypeNative(this.mNativeHolder.mNativePointer);
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

    public TraceInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public TraceInfo(Integer num, String str) {
        this.mNativeHolder = initNativeHolder(num, str);
    }
}
