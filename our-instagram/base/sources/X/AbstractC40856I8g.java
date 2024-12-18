package X;

import java.io.IOException;

/* renamed from: X.I8g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40856I8g {
    public static C51759Mti parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51759Mti c51759Mti = new C51759Mti(13);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product".equals(A0s)) {
                    c51759Mti.A01 = AbstractC111134zU.parseFromJson(c16l);
                } else if ("collection".equals(A0s)) {
                    c51759Mti.A00 = IT1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c51759Mti;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
