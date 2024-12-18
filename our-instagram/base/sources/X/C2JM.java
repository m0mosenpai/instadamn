package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.2JM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JM implements C2JN {
    public final C2JO A00 = new GraphQlCallInput();

    public final void A00(GraphQlCallInput graphQlCallInput, String str) {
        if (graphQlCallInput != null) {
            this.A00.A02().A0E(graphQlCallInput.A02(), str);
        }
    }

    public final void A01(String str) {
        A02(str, Boolean.FALSE);
    }

    public final void A02(String str, Boolean bool) {
        if (bool != null) {
            C0CA.A00(this.A00.A02(), bool, str);
        }
    }

    public final void A03(String str, Number number) {
        if (number != null) {
            C0CA.A00(this.A00.A02(), number, str);
        }
    }

    public final void A04(String str, String str2) {
        if (str2 != null) {
            C0CA.A00(this.A00.A02(), str2, str);
        }
    }

    public final void A05(String str, List list) {
        if (list != null) {
            this.A00.A05(str, list);
        }
    }

    @Override // X.C2JN
    public final Map getParamsCopy() {
        C2JO c2jo = this.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(c2jo.A00, c2jo, treeMap);
        return treeMap;
    }
}
