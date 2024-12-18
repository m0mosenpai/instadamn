package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I9T {
    public static H84 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("op".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("p".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("v".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new H84(f, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
