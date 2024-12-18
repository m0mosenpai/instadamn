package X;

import java.io.IOException;

/* renamed from: X.I1m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40680I1m {
    public static C38594Gxx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51650Mrh c51650Mrh = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("node".equals(AbstractC166997dE.A0s(c16l))) {
                    c51650Mrh = AbstractC40683I1p.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38594Gxx(c51650Mrh);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
