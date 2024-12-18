package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MailboxSDKVideoAttachmentMessageOptionalParams {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getSenderFbIdNative(long j);

    private native String getTextNative(long j);

    private native VideoEdits getVideoEditsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, VideoEdits videoEdits, Number number);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MailboxSDKVideoAttachmentMessageOptionalParams)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKVideoAttachmentMessageOptionalParams) obj).mNativeHolder.mNativePointer);
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

    public MailboxSDKVideoAttachmentMessageOptionalParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
