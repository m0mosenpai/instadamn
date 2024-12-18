package com.instagram.creator.originality.graphql;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;

/* loaded from: classes10.dex */
public final class IGSundialOriginalityRemoveLabelMutationQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtRemoveOriginalityLabelFromMedia extends C2JS implements C2JT {
        public XdtRemoveOriginalityLabelFromMedia() {
            super(-225214745);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "success");
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtRemoveOriginalityLabelFromMedia.class, "xdt_remove_originality_label_from_media(data:$input_data)", -225214745);
    }

    public IGSundialOriginalityRemoveLabelMutationQueryResponseImpl() {
        super(1808408398);
    }
}
