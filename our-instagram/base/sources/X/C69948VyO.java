package X;

import java.io.IOException;

/* renamed from: X.VyO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69948VyO {
    public static C67960V3z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67960V3z c67960V3z = new C67960V3z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("business_manager".equals(A0q)) {
                    c67960V3z.A00 = VU1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c67960V3z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
