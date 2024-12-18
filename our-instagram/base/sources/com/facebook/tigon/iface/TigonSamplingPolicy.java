package com.facebook.tigon.iface;

import X.C0T6;
import X.C24011Fo;

/* loaded from: classes.dex */
public final class TigonSamplingPolicy extends C0T6 {
    public static final int CERT_DATA_WEIGHT = 5000;
    public static final C24011Fo Companion = new Object();
    public final int cellTowerInfoWeight;
    public final int certDataWeight;
    public final int flowTimeWeight;
    public final int mhrFbcWeight;
    public final boolean printTraceEvents;

    public static /* synthetic */ TigonSamplingPolicy copy$default(TigonSamplingPolicy tigonSamplingPolicy, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = tigonSamplingPolicy.flowTimeWeight;
        }
        if ((i5 & 2) != 0) {
            i2 = tigonSamplingPolicy.cellTowerInfoWeight;
        }
        if ((i5 & 4) != 0) {
            i3 = tigonSamplingPolicy.mhrFbcWeight;
        }
        if ((i5 & 8) != 0) {
            i4 = tigonSamplingPolicy.certDataWeight;
        }
        if ((i5 & 16) != 0) {
            z = tigonSamplingPolicy.printTraceEvents;
        }
        return tigonSamplingPolicy.copy(i, i2, i3, i4, z);
    }

    public final int component1() {
        return this.flowTimeWeight;
    }

    public final int component2() {
        return this.cellTowerInfoWeight;
    }

    public final int component3() {
        return this.mhrFbcWeight;
    }

    public final int component4() {
        return this.certDataWeight;
    }

    public final boolean component5() {
        return this.printTraceEvents;
    }

    public final TigonSamplingPolicy copy(int i, int i2, int i3, int i4, boolean z) {
        return new TigonSamplingPolicy(i, i2, i3, i4, z);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public final int getCellTowerInfoWeight() {
        return this.cellTowerInfoWeight;
    }

    public final int getCertDataWeight() {
        return this.certDataWeight;
    }

    public final int getFlowTimeWeight() {
        return this.flowTimeWeight;
    }

    public final int getMhrFbcWeight() {
        return this.mhrFbcWeight;
    }

    public final boolean getPrintTraceEvents() {
        return this.printTraceEvents;
    }

    public TigonSamplingPolicy(int i, int i2, int i3, int i4, boolean z) {
        this.flowTimeWeight = i;
        this.cellTowerInfoWeight = i2;
        this.mhrFbcWeight = i3;
        this.certDataWeight = i4;
        this.printTraceEvents = z;
    }
}
