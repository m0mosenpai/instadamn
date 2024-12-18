package com.instagram.direct.request.graphql;

import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;

/* loaded from: classes10.dex */
public final class IGPinThreadMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtPinThread extends C2JS implements C2JT {
        public XdtPinThread() {
            super(-1736011000);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "json_response");
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtPinThread.class, "xdt_pin_thread(pin:$pin,thread_id:$thread_id)", -1736011000);
    }

    public IGPinThreadMutationResponseImpl() {
        super(456598291);
    }
}
