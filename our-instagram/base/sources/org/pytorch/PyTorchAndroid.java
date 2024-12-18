package org.pytorch;

import X.C09270dc;

/* loaded from: classes4.dex */
public final class PyTorchAndroid {
    public static native void nativeSetNumThreads(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dd, java.lang.Object] */
    static {
        if (!C09270dc.A02()) {
            C09270dc.A00(new Object());
        }
        C09270dc.A01("pytorch_jni_lite");
        try {
            C09270dc.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
