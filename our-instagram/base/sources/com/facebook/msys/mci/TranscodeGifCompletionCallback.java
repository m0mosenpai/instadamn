package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class TranscodeGifCompletionCallback {
    public NativeHolder mNativeHolder;

    private native void failureNative(Throwable th);

    private native void successNative(String str);

    static {
        C53882dS.A00();
    }

    public TranscodeGifCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
