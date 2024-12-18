package com.instagram.appreciation.graphql;

import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;

/* loaded from: classes11.dex */
public final class ContentAppreciationMetricsDataImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class EstimatedEarnings extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(c94754Oe, new C4OW(c94754Oe, "formatted_amount"), "amount_with_offset");
        }

        public EstimatedEarnings() {
            super(-591550938);
        }
    }

    public final EstimatedEarnings A0E() {
        return (EstimatedEarnings) A04(EstimatedEarnings.class, "estimated_earnings", -591550938);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58320PtC.A0V(new C4OW(C94754Oe.A00, AbstractC43591JPw.A00(1003)), new C4OW(C94894Ou.A00, AbstractC43591JPw.A00(904)), EstimatedEarnings.class, "estimated_earnings", -591550938);
    }

    public ContentAppreciationMetricsDataImpl() {
        super(1941391533);
    }
}
