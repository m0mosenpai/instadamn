package X;

/* renamed from: X.Xpp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72870Xpp {
    public int A03;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C56112hz A0C;
    public C56112hz A0D;
    public C56112hz A0E;
    public C56112hz A0F;
    public final /* synthetic */ C72141XPp A0H;
    public C56082hw A0G = null;
    public int A00 = 0;
    public int A0B = 0;
    public int A02 = 0;
    public int A0A = 0;
    public int A01 = 0;
    public int A04 = 0;

    public C72870Xpp(C56112hz c56112hz, C56112hz c56112hz2, C56112hz c56112hz3, C56112hz c56112hz4, C72141XPp c72141XPp, int i, int i2) {
        this.A0H = c72141XPp;
        this.A07 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A06 = 0;
        this.A03 = 0;
        this.A05 = i;
        this.A0D = c56112hz;
        this.A0F = c56112hz2;
        this.A0E = c56112hz3;
        this.A0C = c56112hz4;
        this.A07 = ((C3OI) c72141XPp).A06;
        this.A09 = ((C3OI) c72141XPp).A05;
        this.A08 = ((C3OI) c72141XPp).A07;
        this.A06 = ((C3OI) c72141XPp).A02;
        this.A03 = i2;
    }

    public final int A00() {
        int i = this.A05;
        int i2 = this.A02;
        if (i == 1) {
            return i2 - this.A0H.A0H;
        }
        return i2;
    }

    public final int A01() {
        int i = this.A05;
        int i2 = this.A0B;
        if (i == 0) {
            return i2 - this.A0H.A0A;
        }
        return i2;
    }

    public final void A02(int i) {
        int i2 = this.A04;
        if (i2 != 0) {
            int i3 = this.A01;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.A0A;
                int i7 = i6 + i5;
                C72141XPp c72141XPp = this.A0H;
                if (i7 >= c72141XPp.A06) {
                    break;
                }
                C56082hw c56082hw = c72141XPp.A0O[i6 + i5];
                if (this.A05 == 0) {
                    if (c56082hw != null && c56082hw.A14[0] == C05F.A0C && c56082hw.A0H == 0) {
                        c72141XPp.A0d(c56082hw, C05F.A00, c56082hw.A14[1], i4, c56082hw.A06());
                    }
                } else if (c56082hw != null && c56082hw.A14[1] == C05F.A0C && c56082hw.A0G == 0) {
                    c72141XPp.A0d(c56082hw, c56082hw.A14[0], C05F.A00, c56082hw.A07(), i4);
                }
            }
            this.A0B = 0;
            this.A02 = 0;
            this.A0G = null;
            this.A00 = 0;
            int i8 = this.A01;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.A0A;
                int i11 = i10 + i9;
                C72141XPp c72141XPp2 = this.A0H;
                if (i11 < c72141XPp2.A06) {
                    C56082hw c56082hw2 = c72141XPp2.A0O[i10 + i9];
                    if (this.A05 == 0) {
                        int A07 = c56082hw2.A07();
                        int i12 = c72141XPp2.A0A;
                        if (c56082hw2.A0R == 8) {
                            i12 = 0;
                        }
                        this.A0B += A07 + i12;
                        int A00 = C72141XPp.A00(c56082hw2, c72141XPp2, this.A03);
                        if (this.A0G == null || this.A00 < A00) {
                            this.A0G = c56082hw2;
                            this.A00 = A00;
                            this.A02 = A00;
                        }
                    } else {
                        int A01 = C72141XPp.A01(c56082hw2, c72141XPp2, this.A03);
                        int A002 = C72141XPp.A00(c56082hw2, c72141XPp2, this.A03);
                        int i13 = c72141XPp2.A0H;
                        if (c56082hw2.A0R == 8) {
                            i13 = 0;
                        }
                        this.A02 += A002 + i13;
                        if (this.A0G == null || this.A00 < A01) {
                            this.A0G = c56082hw2;
                            this.A00 = A01;
                            this.A0B = A01;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x014b, code lost:
    
        if (r1 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0224, code lost:
    
        if (r1 != 2) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r18 != 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72870Xpp.A03(int, boolean, boolean):void");
    }

    public final void A04(C56082hw c56082hw) {
        int i = this.A05;
        int i2 = 0;
        C72141XPp c72141XPp = this.A0H;
        int A01 = C72141XPp.A01(c56082hw, c72141XPp, this.A03);
        if (i == 0) {
            if (c56082hw.A14[0] == C05F.A0C) {
                this.A04++;
                A01 = 0;
            }
            int i3 = c72141XPp.A0A;
            if (c56082hw.A0R != 8) {
                i2 = i3;
            }
            this.A0B += A01 + i2;
            int A00 = C72141XPp.A00(c56082hw, c72141XPp, this.A03);
            if (this.A0G == null || this.A00 < A00) {
                this.A0G = c56082hw;
                this.A00 = A00;
                this.A02 = A00;
            }
        } else {
            int A002 = C72141XPp.A00(c56082hw, c72141XPp, this.A03);
            if (c56082hw.A14[1] == C05F.A0C) {
                this.A04++;
                A002 = 0;
            }
            int i4 = c72141XPp.A0H;
            if (c56082hw.A0R != 8) {
                i2 = i4;
            }
            this.A02 += A002 + i2;
            if (this.A0G == null || this.A00 < A01) {
                this.A0G = c56082hw;
                this.A00 = A01;
                this.A0B = A01;
            }
        }
        this.A01++;
    }
}
