package com.facebook.msys.util;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public final class NativeRunnable implements Runnable {
    public NativeHolder mNativeHolder;

    @Override // java.lang.Runnable
    public native void run();

    static {
        C53882dS.A00();
    }

    public NativeRunnable(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
