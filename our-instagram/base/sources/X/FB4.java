package X;

/* loaded from: classes6.dex */
public abstract class FB4 {
    public static void A00(C16L c16l, HB2 hb2, String str) {
        String A1P;
        if ("more_available".equals(str)) {
            c16l.A0d();
            return;
        }
        if ("next_max_id".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            C14360o3.A0B(A1P, 0);
            hb2.A01 = A1P;
            return;
        }
        C55702hA.A01(c16l, hb2, str);
    }
}
