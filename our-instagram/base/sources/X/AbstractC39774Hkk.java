package X;

import java.io.IOException;

/* renamed from: X.Hkk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39774Hkk {
    public static H2Q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H2R h2r = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig_mention".equals(AbstractC166997dE.A0s(c16l))) {
                    h2r = AbstractC39773Hkj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H2Q(h2r);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
