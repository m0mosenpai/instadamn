package X;

import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1M {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.ICM, java.lang.Object] */
    public static ICM parseFromJson(C16L c16l) {
        Integer num;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("userCapabilities".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A0s)) {
                    switch (c16l.A0i()) {
                        case 1:
                            num = C05F.A01;
                            break;
                        case 2:
                            num = C05F.A0C;
                            break;
                        case 3:
                            num = C05F.A0N;
                            break;
                        case 4:
                            num = C05F.A0Y;
                            break;
                        case 5:
                            num = C05F.A0j;
                            break;
                        case 6:
                            num = C05F.A0u;
                            break;
                        case 7:
                            num = C05F.A15;
                            break;
                        case 8:
                            num = C05F.A1F;
                            break;
                        case 9:
                            num = C05F.A1I;
                            break;
                        case 10:
                            num = C05F.A02;
                            break;
                        case 11:
                            num = C05F.A03;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            num = C05F.A04;
                            break;
                        default:
                            num = C05F.A00;
                            break;
                    }
                    C14360o3.A0B(num, 0);
                    obj.A00 = num;
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
