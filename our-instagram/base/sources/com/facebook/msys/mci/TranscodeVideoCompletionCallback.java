package com.facebook.msys.mci;

import X.C0K8;
import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class TranscodeVideoCompletionCallback {
    public NativeHolder mNativeHolder;

    private native void failureNative(Throwable th);

    private native void successNative(String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public void success(String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        successNative(str, d, d2, d3, d4, 0.0d, d6, d7, d8);
    }

    static {
        C53882dS.A00();
    }

    public TranscodeVideoCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public void failure(double d, double d2, Throwable th) {
        C0K8.A0L("TranscodeVideoCompletionCallback", "Failed to transcode video! originalWidth=%s, originalHeight=%s", th, Double.valueOf(d), Double.valueOf(d2));
        failureNative(th);
    }
}
