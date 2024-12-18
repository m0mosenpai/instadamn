package com.facebook.msys.mcd;

import X.C137306Jk;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MediaUploadJobDetail {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native MediaUploadConfig getConfigNative(long j);

    private native MediaUploadContentSource getContentSourceNative(long j);

    private native String getTokenNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(MediaUploadContentSource mediaUploadContentSource, MediaUploadConfig mediaUploadConfig, String str);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MediaUploadJobDetail)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MediaUploadJobDetail) obj).mNativeHolder.mNativePointer);
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
        C137306Jk.A00();
    }

    public MediaUploadJobDetail(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
