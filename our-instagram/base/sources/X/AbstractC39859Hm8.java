package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Hm8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39859Hm8 {
    public static UQk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            UPA upa = null;
            Boolean bool2 = null;
            C38582Gxl c38582Gxl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boosted_component_async_request_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creation_request_accepted".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("error".equals(A0s)) {
                    upa = AbstractC40190HsA.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(972).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c38582Gxl = AbstractC39858Hm7.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("creation_request_accepted", c16l, "CreatePromotionResponseImpl");
                throw C00O.createAndThrow();
            }
            return new UQk(c38582Gxl, upa, bool2, str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
