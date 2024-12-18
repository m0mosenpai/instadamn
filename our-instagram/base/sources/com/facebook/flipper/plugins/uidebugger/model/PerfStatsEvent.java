package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.X0G;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class PerfStatsEvent {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0G.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PerfStatsEvent(int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (4095 != (i & 4095)) {
            AbstractC68612VXn.A00(X0G.A01, i, 4095);
            throw C00O.createAndThrow();
        }
        this.A0B = j;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = j2;
        this.A0A = j3;
        this.A07 = j4;
        this.A05 = j5;
        this.A04 = j6;
        this.A06 = j7;
        this.A08 = j8;
        this.A02 = i4;
        this.A03 = i5;
    }
}
