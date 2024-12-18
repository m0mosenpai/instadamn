package com.facebook.graphql.query;

import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class GraphQlQueryParamSetSerializer extends JsonSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        GraphQlQueryParamSet graphQlQueryParamSet = (GraphQlQueryParamSet) obj;
        if (graphQlQueryParamSet == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        anonymousClass182.A0r("params");
        anonymousClass182.A0J(graphQlQueryParamSet.getParamsCopy());
        anonymousClass182.A0r("input_name");
        anonymousClass182.A0u(null);
        anonymousClass182.A0a();
    }
}
