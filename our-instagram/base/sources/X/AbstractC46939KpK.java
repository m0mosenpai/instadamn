package X;

import java.io.IOException;

/* renamed from: X.KpK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46939KpK {
    public static C29001ad parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C29001ad c29001ad = new C29001ad();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("event_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c29001ad.A00 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c29001ad, A0s);
                }
                c16l.A0z();
            }
            return c29001ad;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
