package X;

import java.io.IOException;

/* renamed from: X.Ntz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53988Ntz {
    public static C54417O2x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54417O2x c54417O2x = new C54417O2x();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("has_ig_avatar".equals(AbstractC166997dE.A0s(c16l))) {
                    c54417O2x.A00 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c54417O2x;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
