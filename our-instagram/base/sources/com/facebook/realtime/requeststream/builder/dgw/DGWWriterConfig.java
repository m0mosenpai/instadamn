package com.facebook.realtime.requeststream.builder.dgw;

/* loaded from: classes.dex */
public class DGWWriterConfig {
    public final long ackTimeoutSec;
    public final boolean enableDGWClientLogging;
    public final boolean enableExecutorCallback;
    public final boolean enableSpecialDrainHandling;
    public final boolean enableStreamCancelBeforeReady;
    public final boolean shouldRespondToDrainingEvents;

    public DGWWriterConfig(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.ackTimeoutSec = j;
        this.enableSpecialDrainHandling = z;
        this.enableStreamCancelBeforeReady = z2;
        this.enableExecutorCallback = z3;
        this.enableDGWClientLogging = z4;
        this.shouldRespondToDrainingEvents = z5;
    }
}
