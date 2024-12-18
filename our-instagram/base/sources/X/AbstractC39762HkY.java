package X;

import com.instagram.api.schemas.AutoDubStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.HkY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39762HkY {
    public static H2M parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            AutoDubStatus autoDubStatus = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("language".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    autoDubStatus = (AutoDubStatus) AutoDubStatus.A01.get(A1P);
                    if (autoDubStatus == null) {
                        autoDubStatus = AutoDubStatus.A09;
                    }
                }
                c16l.A0z();
            }
            return new H2M(autoDubStatus, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
