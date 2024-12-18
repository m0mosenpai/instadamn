package com.facebook.graphql.query;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC61761RtG;
import X.AbstractC63327Shb;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.C2JO;
import X.C44T;
import X.C60576R8r;
import X.C60577R8s;
import X.SQr;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Map;

/* loaded from: classes10.dex */
public class GraphQlQueryParamSetDeserializer extends JsonDeserializer {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        GraphQlQueryParamSet graphQlQueryParamSet = null;
        while (AbstractC61761RtG.A00(c16l) != C16R.A09) {
            try {
                if (c16l.A11() == C16R.A0A) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (A0s.equals("params")) {
                        C60576R8r c60576R8r = new C60576R8r(this);
                        C44T A1K = c16l.A1K();
                        if (A1K != null) {
                            Map map = (Map) A1K.A05(c16l, c60576R8r);
                            graphQlQueryParamSet = new GraphQlQueryParamSet();
                            C2JO c2jo = graphQlQueryParamSet.A00;
                            c2jo.A04(c2jo.A02(), map);
                        } else {
                            throw AbstractC166987dD.A14("No ObjectCodec defined for parser, needed for deserialization");
                        }
                    } else if (A0s.equals("input_name")) {
                        C60577R8s c60577R8s = new C60577R8s(this);
                        C44T A1K2 = c16l.A1K();
                        if (A1K2 != null) {
                            A1K2.A05(c16l, c60577R8s);
                        } else {
                            throw AbstractC166987dD.A14("No ObjectCodec defined for parser, needed for deserialization");
                        }
                    }
                    c16l.A0z();
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                SQr.A00(c16l, GraphQlQueryParamSet.class, e);
                throw C00O.createAndThrow();
            }
        }
        return graphQlQueryParamSet;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        return true;
    }
}
