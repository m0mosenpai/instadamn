package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.VTv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68516VTv {
    public static C68781Vby parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68781Vby c68781Vby = new C68781Vby();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A0s)) {
                    EnumHelper.A00(c16l.A1Q(), EnumC68174VEs.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("metrics".equals(A0s)) {
                    c68781Vby.A00 = AbstractC68514VTt.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68781Vby;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
