package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I2A {
    public static C51848Mvq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("likes".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("metadata".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("metadata", c16l, "MediaKitMedia");
                throw C00O.createAndThrow();
            }
            return new C51848Mvq(c38321qM, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
