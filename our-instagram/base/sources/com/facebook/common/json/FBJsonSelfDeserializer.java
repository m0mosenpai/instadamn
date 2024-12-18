package com.facebook.common.json;

import X.AbstractC166987dD;
import X.AbstractC63327Shb;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.SQr;

/* loaded from: classes10.dex */
public class FBJsonSelfDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        try {
            A0O();
            throw AbstractC166987dD.A15("deserialize");
        } catch (Exception e) {
            AbstractC63327Shb.A03(e);
            SQr.A00(c16l, this.A00, e);
            throw C00O.createAndThrow();
        }
    }
}
