package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1U {
    public static A7Y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            A7Y a7y = new A7Y();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("lat".equals(A0s)) {
                    a7y.A00 = c16l.A0U();
                } else if ("lng".equals(A0s)) {
                    a7y.A01 = c16l.A0U();
                }
                c16l.A0z();
            }
            return a7y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
