package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Hlj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39835Hlj {
    public static E6P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            Long l = null;
            Integer num2 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(924).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("mime_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("url_expiration_timestamp_us".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("video_duration".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, IgReactMediaPickerNativeModule.WIDTH);
                }
                c16l.A0z();
            }
            return new E6P(num, num2, num3, l, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
