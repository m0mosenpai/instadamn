package com.instagram.wellbeing.supervisionupsells.constants;

import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C3R9;
import X.C71744X0j;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class IGSupervisionUpsellEligibilityStatus extends C0T6 {
    public static final Companion Companion = new Object();
    public final boolean A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71744X0j.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGSupervisionUpsellEligibilityStatus) && this.A00 == ((IGSupervisionUpsellEligibilityStatus) obj).A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public IGSupervisionUpsellEligibilityStatus(boolean z) {
        this.A00 = z;
    }

    public /* synthetic */ IGSupervisionUpsellEligibilityStatus(int i, boolean z) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C71744X0j.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = z;
    }
}
