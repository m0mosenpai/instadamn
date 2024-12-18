package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I6X {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IFS] */
    public static IFS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    C14360o3.A0B(I6Z.A00(AbstractC167017dG.A0m(c16l)), 0);
                } else if (AbstractC37300Gc1.A1F(A0q)) {
                    HB5 parseFromJson = IQK.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
