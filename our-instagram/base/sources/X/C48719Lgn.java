package X;

/* renamed from: X.Lgn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48719Lgn implements InterfaceC50460MPo {
    @Override // X.InterfaceC50460MPo
    public final Object AWu(LF7 lf7) {
        float f;
        EnumC40111tc enumC40111tc;
        C14360o3.A0B(lf7, 0);
        Object value = lf7.A04.getValue();
        Number A0t = AbstractC43592JPx.A0t(lf7.A05);
        if (value != null && A0t != null) {
            Number A0t2 = AbstractC43592JPx.A0t(lf7.A0C);
            Number A0t3 = AbstractC43592JPx.A0t(lf7.A0B);
            int intValue = A0t.intValue();
            int i = 1;
            boolean A1P = AbstractC167007dF.A1P(4, intValue);
            int A0A = AbstractC43594JPz.A0A(A0t2);
            if (A0t3 != null && (i = A0t3.intValue()) == 0) {
                f = 1.0f;
            } else {
                f = A0A / i;
            }
            Integer num = C05F.A01;
            C75363a3 A00 = new C101644hZ(num, "").A00();
            boolean z = !A1P;
            if (A1P) {
                enumC40111tc = EnumC40111tc.A0a;
            } else {
                enumC40111tc = EnumC40111tc.A0Q;
            }
            C101594hU c101594hU = new C101594hU(LWN.A00, null, null, null, null, enumC40111tc, null, A00, num, null, null, null, null, "organic", null, null, null, null, C16930sl.A00, f, 1640937600000L, false, A1P, false, false, false, false, z, A1P);
            C101584hT c101584hT = new C101584hT();
            c101584hT.A04 = c101594hU;
            return c101584hT;
        }
        return null;
    }

    @Override // X.InterfaceC50460MPo
    public final C2EY Baf(LF7 lf7) {
        return C2EY.A0q;
    }
}
