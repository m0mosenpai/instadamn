package com.facebook.hermes.instrumentation;

import X.C09170dP;

/* loaded from: classes4.dex */
public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    static {
        C09170dP.A0C("jsijniprofiler");
    }
}
