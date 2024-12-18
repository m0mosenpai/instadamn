package X;

import java.io.IOException;

/* renamed from: X.NuS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54016NuS {
    public static O35 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            O35 o35 = new O35();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("url".equals(A0s)) {
                    o35.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return o35;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
