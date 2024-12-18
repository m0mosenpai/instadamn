package X;

import java.io.File;

/* renamed from: X.02E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02E implements C0OH {
    @Override // X.C0OH
    public final C0NA AAY(C0NA c0na, Integer num) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(c0na, 1);
        if (num == C05F.A0Y) {
            c0na.A02(C0M6.LARGE_REPORT, new C0N9() { // from class: X.02w
                @Override // X.C0N9
                public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
                    C0Pe A05 = c0nk.A05();
                    C14360o3.A07(A05);
                    final File A02 = A05.A02(A05.A07);
                    if (A02 != null) {
                        return new C0LR(A02) { // from class: X.030
                            public final File A00;

                            @Override // X.C0LR
                            public final Integer BW4() {
                                return C05F.A0R;
                            }

                            @Override // X.C0LR
                            public final /* synthetic */ boolean CKv(Integer num2) {
                                return false;
                            }

                            @Override // X.C0LR
                            public final void E4h(C024209q c024209q, C0M6 c0m6) {
                                File file = new File(this.A00, "msys_crash_reporter_file");
                                if (file.exists()) {
                                    c024209q.A04(C0LP.A0D, c0m6, file);
                                }
                            }

                            {
                                this.A00 = A02;
                            }
                        };
                    }
                    return null;
                }
            });
        }
        return c0na;
    }

    @Override // X.C0OH
    public final C0NM AAb(C0NM c0nm, C03970Jn c03970Jn) {
        C14360o3.A0B(c0nm, 1);
        return c0nm;
    }
}
