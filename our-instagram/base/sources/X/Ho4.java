package X;

import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Ho4 {
    public static IGAdScreenshotURLDataDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl = null;
            String str2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("dominant_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("media_background".equals(A0s)) {
                    iGProjectPortalInfoDictImpl = AbstractC40015How.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, IgReactMediaPickerNativeModule.WIDTH);
                }
                c16l.A0z();
            }
            return new IGAdScreenshotURLDataDictImpl(iGProjectPortalInfoDictImpl, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
