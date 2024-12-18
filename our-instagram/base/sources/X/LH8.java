package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class LH8 {
    public static C44148JfD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C44148JfD c44148JfD = new C44148JfD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, c44148JfD, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c44148JfD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, C44148JfD c44148JfD, String str) {
        String A1P;
        if ("modification_token".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            c44148JfD.A00 = A1P;
            return;
        }
        C55702hA.A01(c16l, c44148JfD, str);
    }
}
