package X;

import java.io.IOException;

/* renamed from: X.A1s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22748A1s {
    public static AGG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AGG agg = new AGG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("input_width".equals(A0s)) {
                    agg.A01 = AbstractC167007dF.A0a(c16l);
                } else if ("input_height".equals(A0s)) {
                    agg.A00 = AbstractC167007dF.A0a(c16l);
                } else if ("giphy_uri".equals(A0s)) {
                    agg.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(133).equals(A0s)) {
                    agg.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("ui_version".equals(A0s)) {
                    agg.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return agg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
