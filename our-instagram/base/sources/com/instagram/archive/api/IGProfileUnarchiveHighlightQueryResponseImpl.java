package com.instagram.archive.api;

import X.AbstractC167017dG;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGProfileUnarchiveHighlightQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUnarchiveHighlight extends C2JS implements C2JT {
        public XdtUnarchiveHighlight() {
            super(1664355468);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58323PtF.A0Q(), "error_message");
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XdtUnarchiveHighlight.class, "xdt_unarchive_highlight(request_data:{\"highlight_id\":$highlight_id})", 1664355468);
    }

    public IGProfileUnarchiveHighlightQueryResponseImpl() {
        super(-539191743);
    }
}
