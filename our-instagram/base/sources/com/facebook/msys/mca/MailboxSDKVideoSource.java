package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MailboxSDKVideoSource {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native byte[] getVideoDataNative(long j);

    private native String getVideoFilePathNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, byte[] bArr);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MailboxSDKVideoSource)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKVideoSource) obj).mNativeHolder.mNativePointer);
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

    public MailboxSDKVideoSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
