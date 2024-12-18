package X;

import java.io.IOException;

/* renamed from: X.Hoi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40001Hoi {
    public static C38725H3n parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38721H3j c38721H3j = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38723H3l c38723H3l = null;
            C38724H3m c38724H3m = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("availability".equals(A0s)) {
                    c38721H3j = AbstractC39995Hoc.parseFromJson(c16l);
                } else if ("paymentConfig".equals(A0s)) {
                    c38723H3l = AbstractC39997Hoe.parseFromJson(c16l);
                } else if ("receiverInfo".equals(A0s)) {
                    c38724H3m = AbstractC39999Hog.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38725H3n(c38721H3j, c38723H3l, c38724H3m);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
