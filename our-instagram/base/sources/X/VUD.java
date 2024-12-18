package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUD {
    public static C68794VcB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68794VcB c68794VcB = new C68794VcB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A0s)) {
                    EnumHelper.A00(c16l.A1Q(), EnumC68174VEs.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("metrics".equals(A0s)) {
                    c68794VcB.A00 = VUC.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68794VcB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
