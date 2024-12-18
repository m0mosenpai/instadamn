package com.facebook.proxygen;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class LigerSamplePolicy implements SamplePolicy {
    public static final double CERT_DATA_SAMPLE_RATE = 2.0E-4d;
    public static final long CERT_DATA_SAMPLE_WEIGHT = 5000;
    public static final Companion Companion = new Object();
    public final int cellTowerWeight;
    public final int flowTimeWeight;
    public final boolean isCellTowerSampled;
    public final boolean isCertSampled;
    public final boolean isFlowTimeSampled;
    public final boolean isMhrFbcSampled;
    public final int mhrFbcWeight;
    public final boolean printTraceEvents;

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final int getCellTowerWeight() {
        return this.cellTowerWeight;
    }

    public final int getFlowTimeWeight() {
        return this.flowTimeWeight;
    }

    public final int getMhrFbcWeight() {
        return this.mhrFbcWeight;
    }

    public final boolean isCellTowerSampled() {
        return this.isCellTowerSampled;
    }

    public final boolean isCertSampled() {
        return this.isCertSampled;
    }

    public final boolean isFlowTimeSampled() {
        return this.isFlowTimeSampled;
    }

    public final boolean isMhrFbcSampled() {
        return this.isMhrFbcSampled;
    }

    @Override // com.facebook.proxygen.SamplePolicy
    public boolean isSampled() {
        if (!this.isFlowTimeSampled && !this.printTraceEvents && !this.isCellTowerSampled && !this.isMhrFbcSampled) {
            return false;
        }
        return true;
    }

    public final boolean shouldPrintTraceEvents() {
        return this.printTraceEvents;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r13)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r11)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (java.lang.Math.random() >= (1.0d / r12)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LigerSamplePolicy(int r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            r10.<init>()
            r10.flowTimeWeight = r11
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 1
            if (r11 == 0) goto L16
            double r6 = java.lang.Math.random()
            double r0 = (double) r11
            double r2 = r8 / r0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L17
        L16:
            r0 = 0
        L17:
            r10.isFlowTimeSampled = r0
            r10.cellTowerWeight = r12
            if (r12 == 0) goto L29
            double r6 = java.lang.Math.random()
            double r0 = (double) r12
            double r2 = r8 / r0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L2a
        L29:
            r0 = 0
        L2a:
            r10.isCellTowerSampled = r0
            r10.mhrFbcWeight = r13
            if (r13 <= 0) goto L3b
            double r2 = java.lang.Math.random()
            double r0 = (double) r13
            double r8 = r8 / r0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            r10.isMhrFbcSampled = r0
            double r3 = java.lang.Math.random()
            r1 = 4551510721646314285(0x3f2a36e2eb1c432d, double:2.0E-4)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4c
            r5 = 0
        L4c:
            r10.isCertSampled = r5
            r10.printTraceEvents = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.LigerSamplePolicy.<init>(int, int, int, boolean):void");
    }
}
