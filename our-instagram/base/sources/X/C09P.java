package X;

/* renamed from: X.09P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09P implements C0OH {
    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C0N9 c0n9;
        C0M6 c0m6;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num != C05F.A0C && num != C05F.A0j && num != C05F.A04) {
            if (num != C05F.A0Y && num != C05F.A1I) {
                if (num == C05F.A15) {
                    c0n9 = C0OL.A00;
                    c0na.A02(C0M6.CRITICAL_REPORT, c0n9);
                    c0m6 = C0M6.LARGE_REPORT;
                    c0na.A02(c0m6, c0n9);
                }
                return c0na;
            }
            c0n9 = C0OL.A01;
        } else {
            c0n9 = C0OL.A00;
        }
        if (!C0M4.A00()) {
            c0m6 = C0M6.CRITICAL_REPORT;
            c0na.A02(c0m6, c0n9);
            return c0na;
        }
        c0m6 = C0M6.LARGE_REPORT;
        c0na.A02(c0m6, c0n9);
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        c0nm.A00(new C07430aI(11));
        return c0nm;
    }
}
