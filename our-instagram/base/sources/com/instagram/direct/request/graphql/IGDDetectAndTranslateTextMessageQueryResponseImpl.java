package com.instagram.direct.request.graphql;

import X.AbstractC111324zv;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.C173847oc;
import X.C2JS;
import X.C2JT;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;

/* loaded from: classes11.dex */
public final class IGDDetectAndTranslateTextMessageQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class XigIgdDetectAndTranslateTextMessageQuery extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OW c4ow = new C4OW(C173847oc.A00, AbstractC111324zv.A00(2051));
            C4OW c4ow2 = new C4OW(C94894Ou.A00, AbstractC111324zv.A00(3254));
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, AbstractC43591JPw.A00(206)), new C4OW(c94754Oe, "error_message"), new C4OW(c94754Oe, "item_id"), new C4OW(c94754Oe, "translated_text")});
        }

        public XigIgdDetectAndTranslateTextMessageQuery() {
            super(1202135458);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A02(), XigIgdDetectAndTranslateTextMessageQuery.class, AbstractC43591JPw.A00(1443), 1202135458);
    }

    public IGDDetectAndTranslateTextMessageQueryResponseImpl() {
        super(-1286817171);
    }
}
