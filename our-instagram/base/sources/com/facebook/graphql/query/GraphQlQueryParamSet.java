package com.facebook.graphql.query;

import X.C2JN;
import X.C2JO;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import java.util.TreeMap;

@JsonDeserialize(using = GraphQlQueryParamSetDeserializer.class)
@JsonSerialize(using = GraphQlQueryParamSetSerializer.class)
/* loaded from: classes10.dex */
public final class GraphQlQueryParamSet implements C2JN {
    public C2JO A00 = new C2JO();

    @Override // X.C2JN
    public final Map getParamsCopy() {
        C2JO c2jo = this.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(c2jo.A00, c2jo, treeMap);
        return treeMap;
    }
}
