package com.instagram.direct.request.graphql;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;

/* loaded from: classes10.dex */
public final class IGDirectDismissMessageSuggestionMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtAsyncMessageSuggestionDismiss extends C2JS implements C2JT {
        public XdtAsyncMessageSuggestionDismiss() {
            super(2061957626);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "is_dismissed");
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtAsyncMessageSuggestionDismiss.class, "xdt_async_message_suggestion_dismiss(data:$data)", 2061957626);
    }

    public IGDirectDismissMessageSuggestionMutationResponseImpl() {
        super(1846480455);
    }
}
