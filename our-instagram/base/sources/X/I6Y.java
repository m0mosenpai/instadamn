package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I6Y {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ILf, java.lang.Object] */
    public static C41191ILf parseFromJson(C16L c16l) {
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
                    obj.A02 = A0m;
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    Integer A00 = I6Z.A00(AbstractC167017dG.A0m(c16l));
                    C14360o3.A0B(A00, 0);
                    obj.A01 = A00;
                } else if ("count".equals(A0q)) {
                    obj.A00 = c16l.A1D();
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
