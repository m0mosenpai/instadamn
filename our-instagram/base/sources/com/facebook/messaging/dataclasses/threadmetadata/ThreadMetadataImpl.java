package com.facebook.messaging.dataclasses.threadmetadata;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.C2JS;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C59094QXa;
import X.C59095QXb;
import X.C59096QXc;
import X.C59097QXd;
import X.C59098QXe;
import X.C67A;
import X.C94754Oe;
import X.C94894Ou;
import X.MSV;

/* loaded from: classes10.dex */
public final class ThreadMetadataImpl extends C2JS implements ThreadMetadata {
    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C67A c67a = C67A.A00;
        C4OW A0i = AbstractC166987dD.A0i(c67a, "theme_fbid");
        C4OW A0i2 = AbstractC166987dD.A0i(C94754Oe.A00, "cannot_reply_reason");
        C94894Ou c94894Ou = C94894Ou.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, AbstractC166987dD.A0i(c94894Ou, "message_sound"), AbstractC166987dD.A0h(C4OO.A00(), C59094QXa.class, "magic_words", 1012943950), AbstractC166987dD.A0i(c94894Ou, MSV.A00(105)), AbstractC166987dD.A0h(C4OO.A00(), C59097QXd.class, "pinned_messages", 677957164), AbstractC58318PtA.A0O(C59098QXe.class, "ttlc_message_type", -709565677), AbstractC166987dD.A0i(c67a, "call_link_id"), AbstractC58318PtA.A0O(C59095QXb.class, "marketplace_trust_signal_data", -803034252), AbstractC58318PtA.A0O(C59096QXc.class, "message_ephemerality_setting", 899890693)});
    }

    public ThreadMetadataImpl(int i) {
        super(i);
    }

    public ThreadMetadataImpl() {
        super(-1932172617);
    }
}
