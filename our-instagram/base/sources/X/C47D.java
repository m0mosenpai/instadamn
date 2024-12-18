package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.47D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C47D {
    public static C47E parseFromJson(C16L c16l) {
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
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "SUCustomProfilePicDictImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "SUCustomProfilePicDictImpl");
                } else {
                    return new C47E(num.intValue(), str, num2.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("url", "SUCustomProfilePicDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C47E c47e) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c47e.A00);
        String str = c47e.A02;
        if (str != null) {
            anonymousClass182.A0S("url", str);
        }
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c47e.A01);
        anonymousClass182.A0a();
    }
}
