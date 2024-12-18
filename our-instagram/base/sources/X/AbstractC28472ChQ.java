package X;

/* renamed from: X.ChQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28472ChQ {
    public static final int A01(C59J c59j, C127035oh c127035oh, long j) {
        float f;
        if (c59j != null) {
            f = c59j.BAw();
        } else {
            f = 0.0f;
        }
        float A02 = C119365at.A02(j);
        int A05 = c127035oh.A05(A02);
        if (A02 >= c127035oh.A04(A05) - f && A02 <= c127035oh.A03(A05) + f) {
            float A01 = C119365at.A01(j);
            if (A01 >= (-f) && A01 <= c127035oh.A01 + f) {
                return A05;
            }
        }
        return -1;
    }

    public static final boolean A06(C127055oj c127055oj, int i) {
        BIZ A09;
        C127035oh c127035oh = c127055oj.A03;
        int A06 = c127035oh.A06(i);
        if (i != c127055oj.A03(A06) && i != c127035oh.A07(A06, false)) {
            A09 = c127055oj.A08(i);
            i--;
        } else {
            A09 = c127055oj.A09(i);
        }
        if (A09 != c127055oj.A08(i)) {
            return true;
        }
        return false;
    }

    public static final int A00(CWQ cwq, C59J c59j, long j) {
        C127035oh c127035oh;
        InterfaceC1131459c A01;
        long EM9;
        int A012;
        C28262Cd7 A00 = cwq.A00();
        if (A00 == null || (c127035oh = A00.A02.A03) == null || (A01 = cwq.A01()) == null || (A012 = A01(c59j, c127035oh, (EM9 = A01.EM9(j)))) == -1) {
            return -1;
        }
        return c127035oh.A08(C119365at.A03((c127035oh.A04(A012) + c127035oh.A03(A012)) / 2.0f, 1, EM9));
    }

    public static final long A02(CWQ cwq, C114205Dh c114205Dh, C114205Dh c114205Dh2, InterfaceC31100Dli interfaceC31100Dli, int i) {
        long A03 = A03(cwq, c114205Dh, interfaceC31100Dli, i);
        if (!C5C2.A03(A03)) {
            long A032 = A03(cwq, c114205Dh2, interfaceC31100Dli, i);
            if (!C5C2.A03(A032)) {
                int A06 = AbstractC25225BEi.A06(A03);
                int min = Math.min(A06, A06);
                int A02 = AbstractC25228BEl.A02(A032);
                return C60Z.A00(min, Math.max(A02, A02));
            }
        }
        return C5C2.A01;
    }

    public static final long A03(CWQ cwq, C114205Dh c114205Dh, InterfaceC31100Dli interfaceC31100Dli, int i) {
        C127035oh c127035oh;
        C28262Cd7 A00 = cwq.A00();
        if (A00 != null) {
            c127035oh = A00.A02.A03;
        } else {
            c127035oh = null;
        }
        InterfaceC1131459c A01 = cwq.A01();
        if (c127035oh != null && A01 != null) {
            return c127035oh.A09(c114205Dh.A03(A01.EM9(0L)), interfaceC31100Dli, i);
        }
        return C5C2.A01;
    }

    public static final boolean A04(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean A05(int i) {
        int type;
        if ((Character.isWhitespace(i) || i == 160) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }
}
