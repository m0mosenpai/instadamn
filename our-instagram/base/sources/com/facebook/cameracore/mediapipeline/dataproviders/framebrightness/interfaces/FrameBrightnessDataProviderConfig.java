package com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FrameBrightnessDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FrameBrightnessDataProviderConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig.<init>():void");
    }

    public /* synthetic */ FrameBrightnessDataProviderConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.frameProcessorDelayTolerance = 30000;
        this.frameProcessorWaitTimeout = 70000;
        this.frameProcessorTimeToLive = 15000;
    }
}
