package X;

import java.io.IOException;

/* renamed from: X.HrE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40145HrE {
    public static H4W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38690H2b c38690H2b = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38070Goz c38070Goz = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category".equals(A0s)) {
                    c38690H2b = AbstractC39804HlE.parseFromJson(c16l);
                } else if ("playlist".equals(A0s)) {
                    c38070Goz = AbstractC40144HrD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H4W(c38690H2b, c38070Goz);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
