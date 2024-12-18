package com.facebook.msys.mci;

import X.C2NJ;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class RedactedString {
    public static final RedactedString $redex_init_class = null;
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof RedactedString)) {
            return equalsNative(obj);
        }
        return false;
    }

    static {
        C2NJ.A00();
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
