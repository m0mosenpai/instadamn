package com.instagram.attribution;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class ReportAdvertiserIDMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class ReportAdvertiserId extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, "client_mutation_id");
        }

        public ReportAdvertiserId() {
            super(-1226737321);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(ReportAdvertiserId.class, "report_advertiser_id(data:$input)", -1226737321);
    }

    public ReportAdvertiserIDMutationResponseImpl() {
        super(-913054566);
    }
}
