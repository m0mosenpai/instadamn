package X;

import java.io.IOException;

/* renamed from: X.9xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225479xC {
    public static C9Z9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C84463pp c84463pp = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("bio_product".equals(AbstractC166997dE.A0s(c16l))) {
                    c84463pp = AbstractC84453po.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C9Z9(c84463pp);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
