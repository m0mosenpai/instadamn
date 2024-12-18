package X;

import java.io.IOException;

/* renamed from: X.KpY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46953KpY {
    public static C35871m7 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C35871m7 c35871m7 = new C35871m7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c35871m7.A01 = A1P;
                } else if ("scheduled_timestamp".equals(A0s)) {
                    c35871m7.A00 = c16l.A0y();
                } else {
                    AbstractC47856LCb.A01(c16l, c35871m7, A0s);
                }
                c16l.A0z();
            }
            return c35871m7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
