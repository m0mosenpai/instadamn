package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.KjP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46586KjP {
    public static C26068Bfw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, IgReactMediaPickerNativeModule.WIDTH);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.HEIGHT, c16l, "ContentAppreciationGiftMediaInfo");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.WIDTH, c16l, "ContentAppreciationGiftMediaInfo");
                } else {
                    return new C26068Bfw(num.intValue(), str, num2.intValue(), 0);
                }
            } else {
                AbstractC166997dE.A1V("url", c16l, "ContentAppreciationGiftMediaInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
