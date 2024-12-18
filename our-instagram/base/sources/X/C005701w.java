package X;

/* renamed from: X.01w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005701w implements C0OH {
    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A01) {
            C0N9 c0n9 = C0O3.A02;
            if (c0n9 == null) {
                c0n9 = new C15300pk(8);
                C0O3.A02 = c0n9;
            }
            C0M6 c0m6 = C0M6.CRITICAL_REPORT;
            c0na.A01(c0m6, c0n9);
            c0na.A01(c0m6, new C0N9() { // from class: X.021
                /* JADX WARN: Type inference failed for: r0v0, types: [X.05P, java.lang.Object] */
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    InterfaceC08830cm interfaceC08830cm = c0nk.A07;
                    if (interfaceC08830cm == null) {
                        interfaceC08830cm = new C15310pl(c0nk, 9);
                        c0nk.A07 = interfaceC08830cm;
                    }
                    ?? obj = new Object();
                    obj.A00 = interfaceC08830cm;
                    return obj;
                }
            });
            c0na.A01(c0m6, new C0N9() { // from class: X.01y
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    return new C02P();
                }
            });
        } else {
            Integer num2 = C05F.A02;
            if (num == C05F.A0C || num == C05F.A15 || num == C05F.A0j || num == num2) {
                C0N9 c0n92 = C0O3.A01;
                if (c0n92 == null) {
                    c0n92 = new C15300pk(9);
                    C0O3.A01 = c0n92;
                }
                c0na.A01(C0M6.CRITICAL_REPORT, c0n92);
            }
            if (num == num2) {
                C0N9 c0n93 = C0O3.A01;
                if (c0n93 == null) {
                    c0n93 = new C15300pk(9);
                    C0O3.A01 = c0n93;
                }
                c0na.A05.A00.add(new C15280pi(c0n93, 18));
                return c0na;
            }
        }
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c03970Jn, 0);
        C14360o3.A0B(c0nm, 1);
        Integer num = C05F.A04;
        C0NA c0na = new C0NA(C05F.A0T);
        c0na.A00 = new C15300pk(12);
        c0na.A02 = C05F.A0C;
        C0N9 c0n9 = C0O3.A00;
        if (c0n9 == null) {
            c0n9 = new C15300pk(10);
            C0O3.A00 = c0n9;
        }
        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
        c0na.A01(c0m6, c0n9);
        c0na.A02(c0m6, new C15300pk(11));
        c03970Jn.A00(c0na, num);
        c0nm.A00(c0na.A00());
        return c0nm;
    }
}
