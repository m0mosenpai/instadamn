package com.instagram.direct.request.graphql;

import X.AbstractC111324zv;
import X.AbstractC167017dG;
import X.AbstractC58321PtD;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;

/* loaded from: classes10.dex */
public final class GetInstagramMessagingPromptV2SuggestionsResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XfbIgMessagingPromptv2Suggestions extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Suggestions extends C2JS implements C2JT {
            public Suggestions() {
                super(1691400262);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58321PtD.A0Y();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A02(), Suggestions.class, "suggestions", 1691400262);
        }

        public XfbIgMessagingPromptv2Suggestions() {
            super(-239551392);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XfbIgMessagingPromptv2Suggestions.class, AbstractC111324zv.A00(5602), -239551392);
    }

    public GetInstagramMessagingPromptV2SuggestionsResponseImpl() {
        super(-2007783211);
    }
}
