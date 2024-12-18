package com.mcftypeholder;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public abstract class McfTypeHolder {
    public static final McfTypeHolder $redex_init_class = null;
    public final NativeHolder mNativeHolder;
    public final int mTypeTag;

    private native boolean equalsNative(long j, NativeHolder nativeHolder, long j2);

    private native long hashCodeNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof McfTypeHolder)) {
            long j = this.mNativeHolder.mNativePointer;
            NativeHolder nativeHolder = ((McfTypeHolder) obj).mNativeHolder;
            return equalsNative(j, nativeHolder, nativeHolder.mNativePointer);
        }
        return false;
    }

    static {
        C09170dP.A0C("mcftypeholder");
    }

    public int hashCode() {
        long hashCodeNative = hashCodeNative(this.mNativeHolder.mNativePointer);
        return (int) (hashCodeNative ^ (hashCodeNative >>> 32));
    }

    public McfTypeHolder(int i, NativeHolder nativeHolder) {
        this.mTypeTag = i;
        this.mNativeHolder = nativeHolder;
    }
}
