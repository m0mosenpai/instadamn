package X;

/* renamed from: X.1AD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AD {
    public static final double A00(C06090Tz c06090Tz, long j) {
        C14360o3.A0B(c06090Tz, 1);
        C229419w A02 = A02(j);
        if (A02 == null) {
            return AbstractC20110yi.A00(j);
        }
        return A02.AzB(c06090Tz, j);
    }

    public static final long A01(C06090Tz c06090Tz, long j) {
        C14360o3.A0B(c06090Tz, 1);
        C229419w A02 = A02(j);
        if (A02 == null) {
            return AbstractC20110yi.A01(j);
        }
        return A02.BPF(c06090Tz, j);
    }

    public static final String A04(C06090Tz c06090Tz, long j) {
        String C2x;
        C14360o3.A0B(c06090Tz, 1);
        C229419w A02 = A02(j);
        if (A02 == null) {
            C2x = AbstractC20110yi.A02(j);
        } else {
            C2x = A02.C2x(c06090Tz, j);
        }
        C14360o3.A07(C2x);
        return C2x;
    }

    public static final boolean A06(C06090Tz c06090Tz, long j) {
        C14360o3.A0B(c06090Tz, 1);
        C229419w A02 = A02(j);
        if (A02 == null) {
            if (((j >>> 61) & 1) != 1) {
                return false;
            }
            return true;
        }
        return A02.AhE(c06090Tz, j);
    }

    public static final C229419w A02(long j) {
        C18V c18v = C18V.A01;
        if (c18v == null) {
            C18W.A00(j);
            return null;
        }
        C1AC A01 = c18v.A01();
        if (A01 == null) {
            return null;
        }
        return A01.A01.A00;
    }

    public static final Object A03(C06090Tz c06090Tz, Object obj, long j) {
        C1AC A01;
        boolean z;
        C18V c18v = C18V.A01;
        if (c18v == null) {
            C18W.A00(j);
            A01 = null;
        } else {
            A01 = c18v.A01();
        }
        if (A01 != null) {
            try {
                obj = A01.A01(j, obj);
                if (!z) {
                    return obj;
                }
            } finally {
                if (!c06090Tz.A03) {
                    C229419w c229419w = A01.A01.A00;
                    C14360o3.A0A(c229419w);
                    c229419w.CjF(j);
                }
            }
        }
        return obj;
    }

    public static final void A05(long j) {
        C18V c18v = C18V.A01;
        if (c18v == null) {
            C18W.A00(j);
            return;
        }
        C1AC A01 = c18v.A01();
        if (A01 == null) {
            return;
        }
        C229419w c229419w = A01.A01.A00;
        C14360o3.A0A(c229419w);
        c229419w.CjF(j);
    }
}
