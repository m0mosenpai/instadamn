package X;

import java.io.IOException;

/* renamed from: X.HlP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39815HlP {
    public static C38695H2g parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C37471Gep c37471Gep = null;
            C38758H4y c38758H4y = null;
            C38321qM c38321qM = null;
            H4O h4o = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_media".equals(A0s)) {
                    c37471Gep = AbstractC37470Geo.parseFromJson(c16l);
                } else if ("blending_unit".equals(A0s)) {
                    c38758H4y = AbstractC40208HsX.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("netego_media".equals(A0s)) {
                    h4o = AbstractC40104HqW.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return new C38695H2g(c37471Gep, h4o, c38758H4y, c38321qM, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
