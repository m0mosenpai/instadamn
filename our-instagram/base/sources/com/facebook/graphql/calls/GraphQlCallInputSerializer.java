package com.facebook.graphql.calls;

import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public class GraphQlCallInputSerializer extends JsonSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        GraphQlCallInput graphQlCallInput = (GraphQlCallInput) obj;
        if (graphQlCallInput == null) {
            anonymousClass182.A0b();
        }
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(graphQlCallInput.A00, graphQlCallInput, treeMap);
        anonymousClass182.A0J(treeMap);
    }
}
