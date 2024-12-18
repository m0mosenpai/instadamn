package X;

import org.json.JSONObject;

/* renamed from: X.95j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049695j extends C15E {
    @Override // X.C15E
    public final int A00() {
        return 11;
    }

    @Override // X.C15E
    public final C15P A02(JSONObject jSONObject, int i) {
        int optInt = jSONObject.optInt("timeoutInMillis");
        C15P c15p = new C15P();
        c15p.A00 = optInt;
        c15p.A02 = i;
        return c15p;
    }
}
