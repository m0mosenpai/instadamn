package com.facebook.flexiblesampling;

import X.AnonymousClass001;
import java.util.Random;

/* loaded from: classes.dex */
public final class SamplingResult {
    public static SamplingResult A05;
    public static final Random A06 = new Random();
    public int A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final boolean A04;

    public SamplingResult(long j, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = j;
        this.A04 = z3;
    }

    public final String toString() {
        return AnonymousClass001.A15("com.facebook.flexiblesampling.SamplingResult", AnonymousClass001.A0O("\nSamplingRate: ", this.A00), AnonymousClass001.A1D("\nHasUserConfig: ", this.A01), AnonymousClass001.A1D("\nInUserConfig: ", this.A02), AnonymousClass001.A1D("\nInSessionlessConfig: ", false), AnonymousClass001.A0Q("\nCollectionControlChecksum: ", this.A03), AnonymousClass001.A1D("\nRequiresCollectionControlCheck: ", this.A04));
    }
}
