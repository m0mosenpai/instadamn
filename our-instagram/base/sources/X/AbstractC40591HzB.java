package X;

import java.io.IOException;

/* renamed from: X.HzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40591HzB {
    public static C30711da parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C30711da c30711da = new C30711da();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("repost_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c30711da.A00 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c30711da, A0s);
                }
                c16l.A0z();
            }
            return c30711da;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
