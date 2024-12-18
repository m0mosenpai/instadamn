package X;

/* renamed from: X.0ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09430ds implements C0OH {
    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C0N9 c0n9;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A1I) {
            c0n9 = new C0N9() { // from class: X.0ex
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    return new C02A(c0nk.A0J, C05F.A00, (String) c0nk.A0S.get());
                }
            };
        } else {
            if (num == C05F.A02) {
                c0n9 = new C0N9() { // from class: X.0ej
                    @Override // X.C0N9
                    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                        return new C02A(c0nk.A0J, C05F.A0C, (String) c0nk.A0S.get());
                    }
                };
            }
            return c0na;
        }
        c0na.A01(C0M6.LARGE_REPORT, c0n9);
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }
}
