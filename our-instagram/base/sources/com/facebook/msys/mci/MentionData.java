package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class MentionData {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native String getMentionIdsNative(long j);

    private native String getMentionLengthsNative(long j);

    private native String getMentionOffsetsNative(long j);

    private native String getMentionTypesNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, String str4);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MentionData)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MentionData) obj).mNativeHolder.mNativePointer);
        }
        return false;
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

    public MentionData(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
