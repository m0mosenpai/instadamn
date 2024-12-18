package X;

import java.io.IOException;

/* renamed from: X.TuI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65800TuI {
    public static C25290BHi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            C26086BgF c26086BgF = null;
            C45126Jxv c45126Jxv = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("pending_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("new_leads_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("coupon_data".equals(A0q)) {
                    c26086BgF = AbstractC65801TuJ.parseFromJson(c16l);
                } else if ("error".equals(A0q)) {
                    c45126Jxv = AbstractC65802TuK.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("pending_count", c16l, "AdsManagerInfo");
                throw C00O.createAndThrow();
            }
            return new C25290BHi(c26086BgF, c45126Jxv, num2, num.intValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
