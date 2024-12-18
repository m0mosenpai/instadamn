package X;

/* renamed from: X.8MN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MN {
    public double A00;
    public double A01;
    public C8MG A02;
    public Integer A03 = C05F.A0C;
    public boolean A04;
    public final int A05;
    public final C55982hj A06;

    public C8MN(int i) {
        this.A05 = i;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        A02.A0A(new InterfaceC55932he() { // from class: X.8MO
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                Integer num;
                C14360o3.A0B(c55982hj, 0);
                C8MN c8mn = C8MN.this;
                if (c8mn.A04) {
                    double A00 = C1H4.A00(c55982hj.A09.A00);
                    c8mn.A00 += A00 - c8mn.A01;
                    c8mn.A01 = A00;
                    if (A00 > 0.0d) {
                        double d = c8mn.A05;
                        if (A00 < d) {
                            C8MG c8mg = c8mn.A02;
                            if (c8mg != null) {
                                c8mg.DTu(c8mn.A03, (float) (A00 / d));
                                return;
                            }
                            return;
                        }
                    }
                    double d2 = c8mn.A05;
                    double min = Math.min(A00, d2);
                    c8mn.A01 = min;
                    double max = Math.max(min, 0.0d);
                    c8mn.A01 = max;
                    boolean z = false;
                    c8mn.A04 = false;
                    if ((max <= 0.0d && c8mn.A03 == C05F.A00) || (max >= d2 && c8mn.A03 == C05F.A01)) {
                        z = true;
                    }
                    C8MG c8mg2 = c8mn.A02;
                    if (c8mg2 != null) {
                        if (z) {
                            num = C05F.A0C;
                        } else {
                            num = C05F.A0N;
                        }
                        c8mg2.DDY(num, (float) (max / d2));
                    }
                    c8mn.A00 = 0.0d;
                    c8mn.A01 = 0.0d;
                }
            }
        });
        this.A06 = A02;
    }
}
