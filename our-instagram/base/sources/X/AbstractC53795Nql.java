package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Nql, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53795Nql {
    public static C51752Mtb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51752Mtb c51752Mtb = new C51752Mtb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    c51752Mtb.A01 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    c51752Mtb.A00 = c16l.A1D();
                } else if ("url".equals(A0s)) {
                    c51752Mtb.A02 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return c51752Mtb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
