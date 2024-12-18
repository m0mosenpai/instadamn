package com.instagram.direct.request.graphql;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class IGDMediaCollageMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigIgdSendMediaCollage extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "success");
        }

        public XigIgdSendMediaCollage() {
            super(1200956054);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigIgdSendMediaCollage.class, "xig_igd_send_media_collage(input:$input)", 1200956054);
    }

    public IGDMediaCollageMutationResponseImpl() {
        super(109721225);
    }
}
