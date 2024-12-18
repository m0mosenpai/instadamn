package com.instagram.igsignals.core;

import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C71740X0f;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class IgSignalsFeature {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final String A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71740X0f.A00;
        }
    }

    public IgSignalsFeature(int i, String str, double d) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = d;
    }

    public /* synthetic */ IgSignalsFeature(int i, int i2, String str, double d) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71740X0f.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = i2;
        this.A00 = d;
    }
}
