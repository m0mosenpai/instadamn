package X;

/* loaded from: classes7.dex */
public abstract class ITO {
    public static final boolean A01(MUW muw, C37603Ggy c37603Ggy, C120985dq c120985dq, int i) {
        C14360o3.A0B(c37603Ggy, 3);
        if (!c120985dq.CdW() || !c120985dq.A06().A0t) {
            return false;
        }
        C37603Ggy.A01(muw, c37603Ggy, c120985dq, "primary", new C50368MLv(A00(i), 8));
        return true;
    }

    public static final C11520jB A00(int i) {
        boolean A1M = AbstractC167007dF.A1M(i);
        C11520jB A0B = AbstractC37300Gc1.A0B();
        AbstractC37300Gc1.A0z(C5I8.A24, A0B, true);
        AbstractC37300Gc1.A0z(C5I8.A23, A0B, A1M);
        A0B.A04(C5I8.A22, Integer.valueOf(i));
        return A0B;
    }
}
