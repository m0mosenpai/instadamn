package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTU {
    public static C69118Vi8 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C69118Vi8 c69118Vi8 = new C69118Vi8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    c69118Vi8.A00 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    c69118Vi8.A01 = c16l.A1D();
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c69118Vi8.A02 = A1P;
                }
                c16l.A0z();
            }
            return c69118Vi8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
