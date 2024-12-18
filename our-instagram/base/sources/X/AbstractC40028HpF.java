package X;

import java.io.IOException;

/* renamed from: X.HpF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40028HpF {
    public static H3z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H4T h4t = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("photo3d_info".equals(AbstractC166997dE.A0s(c16l))) {
                    h4t = AbstractC40139Hr8.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H3z(h4t);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
