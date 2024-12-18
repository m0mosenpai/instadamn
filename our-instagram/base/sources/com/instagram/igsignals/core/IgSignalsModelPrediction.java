package com.instagram.igsignals.core;

import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.C3RQ;
import X.C71741X0g;
import X.WD2;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class IgSignalsModelPrediction {
    public long A00;
    public long A01;
    public WD2 A02;
    public final double A03;
    public final String A04;
    public final Map A05;
    public final boolean A06;
    public static final Companion Companion = new Object();
    public static final C3R9[] A07 = {null, new C3RL(C3RD.A01, C3RQ.A00), null, null, null, null, null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71741X0g.A00;
        }
    }

    public /* synthetic */ IgSignalsModelPrediction(WD2 wd2, String str, Map map, double d, int i, long j, long j2, boolean z) {
        this.A03 = (i & 1) == 0 ? -1.0d : d;
        if ((i & 2) == 0) {
            this.A05 = new HashMap();
        } else {
            this.A05 = map;
        }
        if ((i & 4) == 0) {
            this.A06 = true;
        } else {
            this.A06 = z;
        }
        if ((i & 8) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str;
        }
        if ((i & 16) == 0) {
            this.A02 = null;
        } else {
            this.A02 = wd2;
        }
        if ((i & 32) == 0) {
            this.A01 = -1L;
        } else {
            this.A01 = j;
        }
        if ((i & 64) == 0) {
            this.A00 = -1L;
        } else {
            this.A00 = j2;
        }
    }

    public IgSignalsModelPrediction(String str, Map map, double d, boolean z) {
        C14360o3.A0B(map, 2);
        this.A03 = d;
        this.A05 = map;
        this.A06 = z;
        this.A04 = str;
        this.A01 = -1L;
        this.A00 = -1L;
    }

    public IgSignalsModelPrediction() {
        this(null, new HashMap(), -1.0d, true);
    }
}
