package X;

/* renamed from: X.Vvu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69808Vvu {
    public static void A01(WFZ wfz) {
        int i;
        int A04 = wfz.A04(2);
        if (A04 == 0) {
            i = 6;
        } else {
            int A00 = A00(wfz, 5, 8, 16) + 1;
            if (A04 == 1) {
                i = A00 * 7;
            } else {
                if (A04 != 2) {
                    return;
                }
                boolean A0C = wfz.A0C();
                int i2 = 5;
                int i3 = 5;
                if (A0C) {
                    i3 = 1;
                }
                int i4 = 6;
                if (A0C) {
                    i2 = 7;
                    i4 = 8;
                }
                int i5 = 0;
                while (i5 < A00) {
                    if (wfz.A0C()) {
                        wfz.A08(7);
                    } else {
                        if (wfz.A04(2) == 3 && wfz.A04(i2) * i3 != 0) {
                            wfz.A06();
                        }
                        int A042 = wfz.A04(i4) * i3;
                        if (A042 != 0 && A042 != 180) {
                            wfz.A06();
                        }
                        wfz.A06();
                        if (A042 != 0 && A042 != 180 && wfz.A0C()) {
                            i5++;
                        }
                    }
                    i5++;
                }
                return;
            }
        }
        wfz.A08(i);
    }

    public static int A00(WFZ wfz, int i, int i2, int i3) {
        WDn.A01(AbstractC58319PtB.A1P(Math.max(Math.max(i, i2), i3), 31));
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        AbstractC63123SdR.A00(AbstractC63123SdR.A00(i4, i5), 1 << i3);
        if (wfz.A03() >= i) {
            int A04 = wfz.A04(i);
            if (A04 == i4) {
                if (wfz.A03() >= i2) {
                    int A042 = wfz.A04(i2);
                    int i6 = A04 + A042;
                    if (A042 == i5) {
                        if (wfz.A03() >= i3) {
                            return i6 + wfz.A04(i3);
                        }
                    } else {
                        return i6;
                    }
                }
            } else {
                return A04;
            }
        }
        return -1;
    }
}
