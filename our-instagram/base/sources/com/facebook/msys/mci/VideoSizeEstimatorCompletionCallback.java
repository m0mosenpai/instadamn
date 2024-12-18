package com.facebook.msys.mci;

import X.C0K8;
import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class VideoSizeEstimatorCompletionCallback {
    public NativeHolder mNativeHolder;

    private native void failureNative(Throwable th);

    private native void successNative(long j);

    static {
        C53882dS.A00();
    }

    public VideoSizeEstimatorCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public void failure(long j, Throwable th) {
        C0K8.A0L("VideoSizeEstimatorCompletionCallback", "Failed to estimate video size! maxVideoResolution=%s", th, Long.valueOf(j));
        failureNative(th);
    }

    public void success(long j) {
        successNative(j);
    }
}
