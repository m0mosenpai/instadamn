package com.facebook.appperf.messagequeue.monitor.extra.libcio;

import X.C09170dP;
import java.util.Set;

/* loaded from: classes4.dex */
public final class LibcHook {
    public final native void nativeCleanup();

    public final native void nativeInitialize();

    public final native boolean nativeIsTracingEnabled();

    public final native boolean nativeStartTracing();

    public final native Set nativeStopTracing();

    public LibcHook() {
        C09170dP.A0C("libciohook");
    }
}
