package com.instagram.attribution;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class ReportAttributionEventsMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class ReportAttributionEvents extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, "client_mutation_id");
        }

        public ReportAttributionEvents() {
            super(1093563101);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(ReportAttributionEvents.class, "report_attribution_events(data:$input)", 1093563101);
    }

    public ReportAttributionEventsMutationResponseImpl() {
        super(-508306805);
    }
}
