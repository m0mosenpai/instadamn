package com.instagram.jobscheduler.bgfetch;

import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C57117PVg;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class IgBgFetchJobRun {
    public static final Companion Companion = new Object();
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57117PVg.A00;
        }
    }

    public /* synthetic */ IgBgFetchJobRun(int i, int i2, long j, long j2, long j3) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C57117PVg.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A02 = i2;
        this.A03 = j;
        if ((i & 4) == 0) {
            this.A01 = -1L;
        } else {
            this.A01 = j2;
        }
        if ((i & 8) == 0) {
            this.A00 = -1L;
        } else {
            this.A00 = j3;
        }
    }

    public IgBgFetchJobRun(int i, long j) {
        this.A02 = i;
        this.A03 = j;
        this.A01 = -1L;
        this.A00 = -1L;
    }
}
