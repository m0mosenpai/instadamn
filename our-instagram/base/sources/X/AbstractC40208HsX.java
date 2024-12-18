package X;

import java.io.IOException;

/* renamed from: X.HsX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40208HsX {
    public static C38758H4y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H4H h4h = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C26136BhN c26136BhN = null;
            H6N h6n = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("midcard".equals(A0s)) {
                    h4h = AbstractC40085HqC.parseFromJson(c16l);
                } else if ("midcard_v2".equals(A0s)) {
                    c26136BhN = AbstractC40084HqB.parseFromJson(c16l);
                } else if ("su".equals(A0s)) {
                    h6n = AbstractC40359Hv5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38758H4y(h4h, c26136BhN, h6n);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
