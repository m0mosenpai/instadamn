package X;

/* renamed from: X.0KX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KX {
    public final void A00(String str, String str2) {
        C0PX c0px = AbstractC04290Kv.A00;
        if (c0px != null) {
            c0px.A01(new C10850hu("ig-api-json-field", -2, true), str);
        }
        C0PX c0px2 = AbstractC04290Kv.A00;
        if (c0px2 != null) {
            c0px2.A01(new C10850hu("ig-api-json-class", -2, true), str2);
        }
        String A0u = AnonymousClass001.A0u("Unexpected Null: ", str2, "  -- ", str);
        C0w9.A01(EnumC12410kj.A0A, "IgJsonCallback", A0u);
        C0K8.A0D("IgJsonCallback", A0u);
        throw new C90133zu(A0u);
    }
}
