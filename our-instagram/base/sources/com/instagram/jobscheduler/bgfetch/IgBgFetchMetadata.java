package com.instagram.jobscheduler.bgfetch;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C3SG;
import X.C57117PVg;
import X.C57118PVh;
import X.C57119PVi;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class IgBgFetchMetadata {
    public final long A00;
    public final List A01;
    public final List A02;
    public static final Companion Companion = new Object();
    public static final C3R9[] A03 = {null, new C3SG(C57117PVg.A00), new C3SG(C57119PVi.A00)};

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57118PVh.A00;
        }
    }

    public IgBgFetchMetadata(List list, List list2, long j) {
        AbstractC167017dG.A1R(list, list2);
        this.A00 = j;
        this.A01 = list;
        this.A02 = list2;
    }

    public /* synthetic */ IgBgFetchMetadata(List list, List list2, int i, long j) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C57118PVh.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A00 = j;
        this.A01 = list;
        this.A02 = list2;
    }
}
