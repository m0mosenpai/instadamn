package X;

import java.io.IOException;

/* renamed from: X.F5y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34174F5y {
    public static C30181cZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30181cZ c30181cZ = new C30181cZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clip".equals(A0s)) {
                    C1575375n parseFromJson = IQG.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c30181cZ.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c30181cZ, A0s);
                }
                c16l.A0z();
            }
            return c30181cZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
