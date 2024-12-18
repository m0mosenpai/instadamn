package com.facebook.wamsys.wce;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public class EncryptedBackupsAttachment {
    public static final EncryptedBackupsAttachment $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, String str4, String str5, String str6);

    private native boolean nativeEquals(Object obj);

    public native String getEncryptedFileSha();

    public native String getFileSha();

    public native String getMediaKey();

    public native String getMimeType();

    public native String getObjectId();

    public native String getPreviewObjectId();

    public native int hashCode();

    public native String toString();

    static {
        C09170dP.A0C("wamsysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof EncryptedBackupsAttachment)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public EncryptedBackupsAttachment(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public EncryptedBackupsAttachment(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mNativeHolder = initNativeHolder(str, str2, str3, str4, str5, str6);
    }
}
