package com.facebook.logginginfra.falco;

import com.facebook.hyperthrift.HyperThriftBase;

/* loaded from: classes12.dex */
public final class QPLEventConfig extends HyperThriftBase {
    public final QPLCrashResiliency A03() {
        return (QPLCrashResiliency) A00(4);
    }

    public final QPLSamplingMethod A04() {
        return (QPLSamplingMethod) A00(2);
    }
}
