package X;

/* renamed from: X.1XU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XU extends C1WE {
    @Override // X.C1WE
    public final String A0C() {
        return "gdpr";
    }

    @Override // X.C1WE
    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
        boolean z;
        C14360o3.A0B(c116155Nu, 0);
        C14360o3.A0B(abstractC12990ll, 2);
        C14360o3.A0B(l85, 3);
        String str2 = c116155Nu.A0X;
        if (C0BQ.A00(abstractC12990ll).CPH(c116155Nu.A0j) && (C14360o3.A0K(str2, "gdpr_consent") || C14360o3.A0K(str2, "underage_appeal"))) {
            z = true;
        } else {
            z = false;
        }
        l85.A00(z);
    }
}
