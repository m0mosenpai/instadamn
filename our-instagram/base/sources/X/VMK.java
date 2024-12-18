package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class VMK {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vkc, java.lang.Object] */
    public static C69268Vkc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    HashMap hashMap = null;
                    if ("h".equals(A0s)) {
                        obj.A00 = AbstractC167017dG.A0m(c16l);
                    } else if ("media_id".equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(3272).equals(A0s)) {
                        obj.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                        obj.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("xsharing_nonces".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        obj.A04 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
