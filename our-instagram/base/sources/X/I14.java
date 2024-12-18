package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I14 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.I13] */
    public static I13 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_shared_info".equals(A0s)) {
                    c16l.A0d();
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
