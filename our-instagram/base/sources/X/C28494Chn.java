package X;

/* renamed from: X.Chn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28494Chn {
    public long A00;
    public C5C8 A01;
    public final long A02;
    public final C28262Cd7 A03;
    public final CON A04;
    public final C5C8 A05;
    public final C127055oj A06;
    public final InterfaceC31114Dlw A07;
    public final C5C3 A08;

    public C28494Chn(C28262Cd7 c28262Cd7, CON con, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3) {
        C127055oj c127055oj;
        C5C8 c5c8 = c5c3.A01;
        long j = c5c3.A00;
        if (c28262Cd7 != null) {
            c127055oj = c28262Cd7.A02;
        } else {
            c127055oj = null;
        }
        this.A05 = c5c8;
        this.A02 = j;
        this.A06 = c127055oj;
        this.A07 = interfaceC31114Dlw;
        this.A04 = con;
        this.A00 = j;
        this.A01 = c5c8;
        this.A08 = c5c3;
        this.A03 = c28262Cd7;
    }

    public static final int A00(C28262Cd7 c28262Cd7, C28494Chn c28494Chn, int i) {
        C114205Dh c114205Dh;
        InterfaceC1131459c interfaceC1131459c;
        InterfaceC1131459c interfaceC1131459c2 = c28262Cd7.A01;
        if (interfaceC1131459c2 != null && (interfaceC1131459c = c28262Cd7.A00) != null) {
            c114205Dh = interfaceC1131459c.Chk(interfaceC1131459c2, true);
        } else {
            c114205Dh = C114205Dh.A04;
        }
        InterfaceC31114Dlw interfaceC31114Dlw = c28494Chn.A07;
        int E36 = interfaceC31114Dlw.E36(AbstractC25228BEl.A02(c28494Chn.A08.A00));
        C127055oj c127055oj = c28262Cd7.A02;
        C114205Dh A06 = c127055oj.A06(E36);
        return interfaceC31114Dlw.F8T(c127055oj.A03.A08(AbstractC119395aw.A00(A06.A01, A06.A03 + (C5YC.A00(c114205Dh.A01()) * i))));
    }

    public static int A01(C28494Chn c28494Chn) {
        c28494Chn.A04.A00 = null;
        return c28494Chn.A01.A00.length();
    }

    public static int A02(C28494Chn c28494Chn) {
        return c28494Chn.A01.A00.length();
    }

    public static final int A03(C28494Chn c28494Chn, C127055oj c127055oj, int i) {
        InterfaceC31114Dlw interfaceC31114Dlw = c28494Chn.A07;
        int E36 = interfaceC31114Dlw.E36(AbstractC25228BEl.A02(c28494Chn.A00));
        CON con = c28494Chn.A04;
        if (con.A00 == null) {
            con.A00 = Float.valueOf(c127055oj.A06(E36).A01);
        }
        C127035oh c127035oh = c127055oj.A03;
        int A06 = c127035oh.A06(E36) + i;
        if (A06 < 0) {
            return 0;
        }
        if (A06 >= c127035oh.A02) {
            return A02(c28494Chn);
        }
        float A03 = c127035oh.A03(A06) - 1.0f;
        Float f = con.A00;
        C14360o3.A0A(f);
        float floatValue = f.floatValue();
        if ((A06(c28494Chn) && floatValue >= c127055oj.A01(A06)) || (!A06(c28494Chn) && floatValue <= c127055oj.A00(A06))) {
            return c127035oh.A07(A06, true);
        }
        return interfaceC31114Dlw.F8T(c127035oh.A08(AbstractC119395aw.A00(floatValue, A03)));
    }

    public static final void A04(C28494Chn c28494Chn) {
        int A00;
        c28494Chn.A04.A00 = null;
        String str = c28494Chn.A01.A00;
        if (str.length() > 0 && (A00 = SQO.A00(str, AbstractC25228BEl.A02(c28494Chn.A00))) != -1) {
            c28494Chn.A00 = C60Z.A00(A00, A00);
        }
    }

    public static final void A05(C28494Chn c28494Chn) {
        int A01;
        c28494Chn.A04.A00 = null;
        String str = c28494Chn.A01.A00;
        if (str.length() > 0 && (A01 = SQO.A01(str, AbstractC25228BEl.A02(c28494Chn.A00))) != -1) {
            c28494Chn.A00 = C60Z.A00(A01, A01);
        }
    }

    public static final boolean A06(C28494Chn c28494Chn) {
        BIZ biz;
        C127055oj c127055oj = c28494Chn.A06;
        if (c127055oj != null) {
            biz = c127055oj.A09(c28494Chn.A07.E36(AbstractC25228BEl.A02(c28494Chn.A00)));
        } else {
            biz = null;
        }
        return AbstractC25229BEm.A1a(biz, BIZ.Rtl);
    }

    public final Integer A07() {
        C127055oj c127055oj = this.A06;
        if (c127055oj == null) {
            return null;
        }
        InterfaceC31114Dlw interfaceC31114Dlw = this.A07;
        int E36 = interfaceC31114Dlw.E36(C5C2.A00(this.A00));
        C127035oh c127035oh = c127055oj.A03;
        return Integer.valueOf(interfaceC31114Dlw.F8T(c127035oh.A07(c127035oh.A06(E36), true)));
    }

    public final Integer A08() {
        int length;
        C127055oj c127055oj = this.A06;
        if (c127055oj == null) {
            return null;
        }
        InterfaceC31114Dlw interfaceC31114Dlw = this.A07;
        int E36 = interfaceC31114Dlw.E36((int) (this.A00 & 4294967295L));
        while (true) {
            length = this.A05.length();
            if (E36 >= length) {
                break;
            }
            int A02 = A02(this) - 1;
            int i = E36;
            if (E36 > A02) {
                i = A02;
            }
            int A04 = (int) (c127055oj.A04(i) & 4294967295L);
            if (A04 <= E36) {
                E36++;
            } else {
                length = interfaceC31114Dlw.F8T(A04);
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer A09() {
        int i;
        C127055oj c127055oj = this.A06;
        if (c127055oj == null) {
            return null;
        }
        InterfaceC31114Dlw interfaceC31114Dlw = this.A07;
        int E36 = interfaceC31114Dlw.E36(AbstractC25228BEl.A02(this.A00));
        while (true) {
            if (E36 <= 0) {
                i = 0;
                break;
            }
            int A02 = A02(this) - 1;
            int i2 = E36;
            if (E36 > A02) {
                i2 = A02;
            }
            int A06 = AbstractC25225BEi.A06(c127055oj.A04(i2));
            if (A06 >= E36) {
                E36--;
            } else {
                i = interfaceC31114Dlw.F8T(A06);
                break;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r2 >= r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4.charAt(r2) != '\n') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r2 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            r5 = this;
            X.CON r1 = r5.A04
            r0 = 0
            r1.A00 = r0
            X.5C8 r0 = r5.A01
            java.lang.String r4 = r0.A00
            int r3 = r4.length()
            if (r3 <= 0) goto L3f
            long r0 = r5.A00
            int r2 = X.C5C2.A00(r0)
        L15:
            if (r2 >= r3) goto L22
            char r1 = r4.charAt(r2)
            r0 = 10
            if (r1 == r0) goto L23
            int r2 = r2 + 1
            goto L15
        L22:
            r2 = r3
        L23:
            long r0 = r5.A00
            int r0 = X.C5C2.A00(r0)
            if (r2 != r0) goto L39
            if (r2 == r3) goto L39
        L2d:
            int r2 = r2 + 1
            if (r2 >= r3) goto L40
            char r1 = r4.charAt(r2)
            r0 = 10
            if (r1 != r0) goto L2d
        L39:
            long r0 = X.C60Z.A00(r2, r2)
            r5.A00 = r0
        L3f:
            return
        L40:
            r2 = r3
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28494Chn.A0B():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r2 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3.charAt(r2 - 1) != '\n') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            r4 = this;
            X.CON r1 = r4.A04
            r0 = 0
            r1.A00 = r0
            X.5C8 r0 = r4.A01
            java.lang.String r3 = r0.A00
            int r0 = r3.length()
            if (r0 <= 0) goto L43
            long r0 = r4.A00
            int r2 = X.C5C2.A01(r0)
        L15:
            if (r2 <= 0) goto L24
            int r0 = r2 + (-1)
            char r1 = r3.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L25
            int r2 = r2 + (-1)
            goto L15
        L24:
            r2 = 0
        L25:
            long r0 = r4.A00
            int r0 = X.C5C2.A01(r0)
            if (r2 != r0) goto L3d
            if (r2 == 0) goto L3d
        L2f:
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L44
            int r0 = r2 + (-1)
            char r1 = r3.charAt(r0)
            r0 = 10
            if (r1 != r0) goto L2f
        L3d:
            long r0 = X.C60Z.A00(r2, r2)
            r4.A00 = r0
        L43:
            return
        L44:
            r2 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28494Chn.A0C():void");
    }

    public final void A0A() {
        Integer A08;
        if (A01(this) > 0) {
            boolean A06 = A06(this);
            int A01 = A01(this);
            if (A06) {
                if (A01 > 0) {
                    A08 = A09();
                } else {
                    return;
                }
            } else if (A01 <= 0) {
                return;
            } else {
                A08 = A08();
            }
            if (A08 != null) {
                int intValue = A08.intValue();
                this.A00 = C60Z.A00(intValue, intValue);
            }
        }
    }

    public final void A0D() {
        Integer A09;
        if (A01(this) > 0) {
            boolean A06 = A06(this);
            int A01 = A01(this);
            if (A06) {
                if (A01 > 0) {
                    A09 = A08();
                } else {
                    return;
                }
            } else if (A01 <= 0) {
                return;
            } else {
                A09 = A09();
            }
            if (A09 != null) {
                int intValue = A09.intValue();
                this.A00 = C60Z.A00(intValue, intValue);
            }
        }
    }

    public final void A0E() {
        C127055oj c127055oj;
        if (A01(this) > 0 && (c127055oj = this.A06) != null) {
            InterfaceC31114Dlw interfaceC31114Dlw = this.A07;
            int F8T = interfaceC31114Dlw.F8T(c127055oj.A03(c127055oj.A03.A06(interfaceC31114Dlw.E36(C5C2.A01(this.A00)))));
            if (Integer.valueOf(F8T) != null) {
                this.A00 = C60Z.A00(F8T, F8T);
            }
        }
    }
}
