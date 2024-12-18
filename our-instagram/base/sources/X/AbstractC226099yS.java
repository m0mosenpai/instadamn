package X;

import java.io.IOException;

/* renamed from: X.9yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226099yS {
    public static C217879kK parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C217879kK c217879kK = new C217879kK();
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
                    c217879kK.A02 = A1P;
                } else if ("text_size".equals(A0s)) {
                    c217879kK.A00 = (float) c16l.A0U();
                } else if ("max_width".equals(A0s)) {
                    c217879kK.A01 = c16l.A1D();
                } else {
                    ADU.A01(c16l, c217879kK, A0s);
                }
                c16l.A0z();
            }
            return c217879kK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
