package com.instagram.jobscheduler.bgfetch;

import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C57119PVi;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class IgBgFetchPendingJob {
    public static final Companion Companion = new Object();
    public final long A00;
    public final IgBgFetchJob A01;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57119PVi.A00;
        }
    }

    public /* synthetic */ IgBgFetchPendingJob(IgBgFetchJob igBgFetchJob, int i, long j) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C57119PVi.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = igBgFetchJob;
        this.A00 = j;
    }

    public IgBgFetchPendingJob(IgBgFetchJob igBgFetchJob, long j) {
        C14360o3.A0B(igBgFetchJob, 1);
        this.A01 = igBgFetchJob;
        this.A00 = j;
    }
}
