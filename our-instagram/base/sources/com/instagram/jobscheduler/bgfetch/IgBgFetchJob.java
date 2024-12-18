package com.instagram.jobscheduler.bgfetch;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C3R9;
import X.C57116PVf;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class IgBgFetchJob extends C0T6 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final long A01;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57116PVf.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgBgFetchJob) {
                IgBgFetchJob igBgFetchJob = (IgBgFetchJob) obj;
                if (this.A00 != igBgFetchJob.A00 || this.A01 != igBgFetchJob.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ IgBgFetchJob(int i, int i2, long j) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C57116PVf.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = j;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        A1C.append(':');
        A1C.append(this.A01);
        return A1C.toString();
    }

    public IgBgFetchJob(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
