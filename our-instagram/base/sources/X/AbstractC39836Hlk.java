package X;

import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Hlk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39836Hlk {
    public static E6Q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            DirectMediaFallbackUrl directMediaFallbackUrl = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            Long l = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fallback".equals(A0s)) {
                    directMediaFallbackUrl = AbstractC101884hz.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("url_expiration_timestamp_us".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, IgReactMediaPickerNativeModule.WIDTH);
                }
                c16l.A0z();
            }
            return new E6Q(directMediaFallbackUrl, num, num2, num3, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
