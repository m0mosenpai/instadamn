package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AE0 {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.A8O] */
    public static A8O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A02 = str;
            }
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 != null) {
                obj.A00 = num2.intValue();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, A8O a8o) {
        anonymousClass182.A0d();
        String str = a8o.A02;
        if (str != null) {
            anonymousClass182.A0S("url", str);
        }
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, a8o.A01);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, a8o.A00);
        anonymousClass182.A0a();
    }
}
