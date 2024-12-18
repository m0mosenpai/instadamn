package com.facebook.papaya.client.type;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.EnumC53241Nge;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PapayaRestrictions {
    public final Map A00 = AbstractC166987dD.A1G();

    public final ImmutableMap A00() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            builder.put(((EnumC53241Nge) A1K.getKey()).A00, Long.valueOf(AbstractC166987dD.A0N(A1K.getValue())));
        }
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        return buildOrThrow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A00, ((PapayaRestrictions) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
