package com.facebook.common.json;

import X.AbstractC61762RtH;
import X.AbstractC63327Shb;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C63117SdL;
import X.SQr;
import android.util.Base64;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class TreeFragmentModelBase64Deserializer extends FbJsonDeserializer {
    public Class A00;

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        try {
            String A1Q = c16l.A1Q();
            if (A1Q == null) {
                return null;
            }
            int A00 = AbstractC61762RtH.A00(A1Q);
            if (A1Q.startsWith("type_tag:")) {
                A1Q = A1Q.substring(18);
            }
            return C63117SdL.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(A1Q, 2)), this.A00, A00);
        } catch (Exception e) {
            AbstractC63327Shb.A03(e);
            SQr.A00(c16l, this.A00, e);
            throw C00O.createAndThrow();
        }
    }
}
