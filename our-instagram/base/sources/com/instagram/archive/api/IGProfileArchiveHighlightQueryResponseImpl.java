package com.instagram.archive.api;

import X.AbstractC167017dG;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGProfileArchiveHighlightQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtArchiveHighlight extends C2JS implements C2JT {
        public XdtArchiveHighlight() {
            super(-1082420162);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58323PtF.A0Q(), "error_message");
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XdtArchiveHighlight.class, "xdt_archive_highlight(request_data:{\"highlight_id\":$highlight_id})", -1082420162);
    }

    public IGProfileArchiveHighlightQueryResponseImpl() {
        super(1109988414);
    }
}
