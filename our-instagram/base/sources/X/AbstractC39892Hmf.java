package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Hmf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39892Hmf {
    public static C66635UQn parseFromJson(C16L c16l) {
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
                AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.HEIGHT, c16l, "CustomProfilePicUrlImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.WIDTH, c16l, "CustomProfilePicUrlImpl");
                } else {
                    return new C66635UQn(num.intValue(), str, num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V("url", c16l, "CustomProfilePicUrlImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
