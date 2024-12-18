package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FX7 {
    public static C32178EBz parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32178EBz c32178EBz = new C32178EBz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("location_page_to_share_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c32178EBz.A00 = A1P;
                } else {
                    C55702hA.A01(c16l, c32178EBz, A0s);
                }
                c16l.A0z();
            }
            return c32178EBz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
