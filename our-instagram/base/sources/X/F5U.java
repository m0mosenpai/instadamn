package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5U {
    public static C33991iz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33991iz c33991iz = new C33991iz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread_subtype".equals(A0s)) {
                    c33991iz.A01 = c16l.A1D();
                } else if ("thread_audience".equals(A0s)) {
                    c33991iz.A00 = c16l.A1D();
                } else {
                    FV3.A01(c16l, c33991iz, A0s);
                }
                c16l.A0z();
            }
            return c33991iz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
