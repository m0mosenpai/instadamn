package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.18U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C18U {
    public static final double A00(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        C14360o3.A0B(c06090Tz, 2);
        C229419w A02 = A02(abstractC12990ll, j);
        if (A02 == null) {
            return AbstractC20110yi.A00(j);
        }
        return A02.AzB(c06090Tz, j);
    }

    public static final long A01(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        C14360o3.A0B(c06090Tz, 2);
        C229419w A02 = A02(abstractC12990ll, j);
        if (A02 == null) {
            return AbstractC20110yi.A01(j);
        }
        return A02.BPF(c06090Tz, j);
    }

    public static final String A04(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        String C2x;
        C14360o3.A0B(c06090Tz, 2);
        C229419w A02 = A02(abstractC12990ll, j);
        if (A02 == null) {
            C2x = AbstractC20110yi.A02(j);
        } else {
            C2x = A02.C2x(c06090Tz, j);
        }
        C14360o3.A07(C2x);
        return C2x;
    }

    public static final boolean A06(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        C14360o3.A0B(c06090Tz, 2);
        C229419w A02 = A02(abstractC12990ll, j);
        if (A02 == null) {
            if (((j >>> 61) & 1) != 1) {
                return false;
            }
            return true;
        }
        return A02.AhE(c06090Tz, j);
    }

    public static final C229419w A02(AbstractC12990ll abstractC12990ll, long j) {
        C1AC A02;
        C18V c18v = C18V.A01;
        if (c18v == null) {
            C18W.A00(j);
            return null;
        }
        if (!(abstractC12990ll instanceof UserSession) || (A02 = c18v.A02((UserSession) abstractC12990ll)) == null) {
            return null;
        }
        return A02.A01.A00;
    }

    public static final Object A03(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, Object obj, long j) {
        boolean z;
        C18V c18v = C18V.A01;
        C1AC c1ac = null;
        if (c18v == null) {
            C18W.A00(j);
        } else if (abstractC12990ll instanceof UserSession) {
            c1ac = c18v.A02((UserSession) abstractC12990ll);
        }
        if (c1ac != null) {
            try {
                obj = c1ac.A01(j, obj);
                C14360o3.A0A(obj);
                if (!z) {
                    return obj;
                }
            } finally {
                if (!c06090Tz.A03) {
                    C229419w c229419w = c1ac.A01.A00;
                    C14360o3.A0A(c229419w);
                    c229419w.CjF(j);
                }
            }
        }
        return obj;
    }

    public static final boolean A05(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        return A06(c06090Tz, abstractC12990ll, 36317195482960753L);
    }
}
