package X;

import java.io.IOException;

/* renamed from: X.NuT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54017NuT {
    public static OAH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OAH oah = new OAH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("length".equals(A0s)) {
                    oah.A00 = c16l.A1D();
                } else if ("offset".equals(A0s)) {
                    oah.A01 = c16l.A1D();
                } else if ("entity".equals(A0s)) {
                    oah.A02 = AbstractC54016NuS.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return oah;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
