package X;

import java.io.IOException;

/* renamed from: X.A2f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22761A2f {
    public static C8FD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C8FD c8fd = new C8FD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offset_y".equals(A0s)) {
                    c8fd.A00 = (float) c16l.A0U();
                } else if ("scale".equals(A0s)) {
                    c8fd.A01 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c8fd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
