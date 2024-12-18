package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.io.IOException;

/* renamed from: X.4ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109704ww {
    public static C109724wz parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            LiveUserPaySupportTier liveUserPaySupportTier = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("digital_product_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("sku".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("support_tier".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    liveUserPaySupportTier = AbstractC109714wx.A00(A1P);
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("digital_product_id", "LiveUserPayTierInfo");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (liveUserPaySupportTier == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("support_tier", "LiveUserPayTierInfo");
                } else {
                    return new C109724wz(liveUserPaySupportTier, str, l.longValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("sku", "LiveUserPayTierInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
