package com.instagram.archive.api;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class ProfileSetMyWeekMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUpdateHighlightsSettings extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "my_week_enabled");
        }

        public XdtUpdateHighlightsSettings() {
            super(-624958192);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtUpdateHighlightsSettings.class, "xdt_update_highlights_settings(request_data:$request_data)", -624958192);
    }

    public ProfileSetMyWeekMutationResponseImpl() {
        super(1006239352);
    }
}
