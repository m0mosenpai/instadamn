package X;

import android.app.Application;

/* renamed from: X.0Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02860Bk implements C0OH {
    public final C04140Kg A00;
    public final C02S A01;

    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C0M6 c0m6;
        C0N9 c15280pi;
        C0M6 c0m62;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        int intValue = num.intValue();
        switch (intValue) {
            case 2:
            case 5:
            case 6:
            case 7:
                C0D0 c0d0 = new C0N9() { // from class: X.0D0
                    @Override // X.C0N9
                    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                        return new Object();
                    }
                };
                if (C0M4.A00()) {
                    c0m6 = C0M6.LARGE_REPORT;
                } else {
                    c0m6 = C0M6.CRITICAL_REPORT;
                }
                c0na.A01(c0m6, c0d0);
                break;
            case 4:
            case 9:
                c0na.A02(C0M6.CRITICAL_REPORT, new C0N9() { // from class: X.0Cv
                    @Override // X.C0N9
                    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                        return new Object();
                    }
                });
                break;
        }
        if (intValue != 6) {
            if (intValue != 9 && intValue != 4 && intValue != 3) {
                if (intValue == 10) {
                    c15280pi = new C0N9() { // from class: X.0Bq
                        @Override // X.C0N9
                        public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                            return new C0LR(c0nk.A0J) { // from class: X.04k
                                public final Application A00;

                                @Override // X.C0LR
                                public final void E4h(C024209q c024209q, C0M6 c0m63) {
                                    String str;
                                    C14360o3.A0B(c024209q, 0);
                                    C11M A002 = C11M.A00(this.A00);
                                    synchronized (A002) {
                                        str = A002.A00;
                                    }
                                    C14360o3.A07(str);
                                    c024209q.A03(C0LK.A8w, str);
                                }

                                @Override // X.C0LR
                                public final Integer BW4() {
                                    return C05F.A0q;
                                }

                                @Override // X.C0LR
                                public final /* synthetic */ boolean CKv(Integer num2) {
                                    return false;
                                }

                                {
                                    this.A00 = r1;
                                }
                            };
                        }
                    };
                    c0m62 = C0M6.CRITICAL_REPORT;
                }
                return c0na;
            }
            C15280pi c15280pi2 = new C15280pi(this, 14);
            c0na.A02(C0M6.CRITICAL_REPORT, c15280pi2);
            c0na.A02(C0M6.LARGE_REPORT, c15280pi2);
            return c0na;
        }
        c15280pi = new C15280pi(this, 13);
        c0na.A01(C0M6.CRITICAL_REPORT, c15280pi);
        c0m62 = C0M6.LARGE_REPORT;
        c0na.A01(c0m62, c15280pi);
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }

    public C02860Bk(C04140Kg c04140Kg, C02S c02s) {
        this.A00 = c04140Kg;
        this.A01 = c02s;
    }
}
