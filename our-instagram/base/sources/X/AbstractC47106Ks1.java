package X;

import java.io.IOException;

/* renamed from: X.Ks1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47106Ks1 {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Ks0] */
    public static C47105Ks0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_next_page".equals(A0s)) {
                    c16l.A0d();
                } else if ("next_item_cursor".equals(A0s) && c16l.A11() != C16R.A0G) {
                    c16l.A1P();
                }
                c16l.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
