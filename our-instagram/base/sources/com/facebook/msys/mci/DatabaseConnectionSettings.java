package com.facebook.msys.mci;

import X.C6ED;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class DatabaseConnectionSettings {
    public final NativeHolder mNativeHolder;

    public native void config(int i, boolean z, int i2, boolean z2, boolean z3, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, long j);

    static {
        C6ED.A00();
    }

    public DatabaseConnectionSettings(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
