package com.facebook.msys.mci;

import X.C0K8;
import X.C53882dS;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes.dex */
public class TranscodeImageCompletionCallback {
    public NativeHolder mNativeHolder;

    private native void failureNative(Throwable th);

    private native void successNative(String str, String str2, Map map, Map map2);

    static {
        C53882dS.A00();
    }

    public TranscodeImageCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public void failure(double d, double d2, double d3, double d4, Throwable th) {
        C0K8.A0L("TranscodeImageCompletionCallback", "Failed to transcode image! primaryOriginalWidth=%s, primaryOriginalHeight=%s, secondaryOriginalWidth=%s, secondaryOriginalHeight=%s", th, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
        failureNative(th);
    }

    public void success(String str, String str2, Map map, Map map2) {
        successNative(str, str2, map, map2);
    }
}
