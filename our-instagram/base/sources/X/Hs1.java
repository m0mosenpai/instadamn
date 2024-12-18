package X;

import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hs1 {
    public static ProductTileUCILoggingInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_finder_logging_blob".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ranking_extra_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1204).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("ranking_unit_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("uci_request_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else {
                    l2 = AbstractC37303Gc4.A0O(c16l, l2, A0s, "user_id_for_use_in_shops");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("ranking_unit_id", c16l, "ProductTileUCILoggingInfoImpl");
            } else if (str4 != null || !(c16l instanceof C07950bF)) {
                if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("user_id_for_use_in_shops", c16l, "ProductTileUCILoggingInfoImpl");
                } else {
                    return new ProductTileUCILoggingInfoImpl(l.longValue(), str, str2, str3, str4, l2.longValue());
                }
            } else {
                AbstractC166997dE.A1V("uci_request_id", c16l, "ProductTileUCILoggingInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
