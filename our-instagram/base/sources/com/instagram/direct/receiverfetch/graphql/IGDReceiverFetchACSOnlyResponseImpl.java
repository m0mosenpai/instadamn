package com.instagram.direct.receiverfetch.graphql;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;

/* loaded from: classes10.dex */
public final class IGDReceiverFetchACSOnlyResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class IgdReceiverFetchDeidentified extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(IGDReceiverFetchFragmentImpl.class, "IGDReceiverFetchFragment", 509676106);
        }

        public IgdReceiverFetchDeidentified() {
            super(-283848626);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(IgdReceiverFetchDeidentified.class, "igd_receiver_fetch_deidentified(input:$input)", -283848626);
    }

    public IGDReceiverFetchACSOnlyResponseImpl() {
        super(-132063907);
    }
}
