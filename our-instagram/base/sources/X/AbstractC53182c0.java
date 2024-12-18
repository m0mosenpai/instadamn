package X;

/* renamed from: X.2c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53182c0 {
    public static final boolean A00() {
        C53192c1 c53192c1 = C53192c1.A01;
        if (c53192c1 != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, C53192c1.A00(c53192c1), 36328306563759561L);
            if (Boolean.valueOf(A06) != null) {
                return A06;
            }
        }
        return false;
    }

    public static final boolean A01(boolean z) {
        C06090Tz c06090Tz;
        C53192c1 c53192c1 = C53192c1.A01;
        if (c53192c1 != null) {
            AbstractC12990ll A00 = C53192c1.A00(c53192c1);
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz, A00, 36328306563628488L);
            if (Boolean.valueOf(A06) != null) {
                return A06;
            }
        }
        return false;
    }
}
