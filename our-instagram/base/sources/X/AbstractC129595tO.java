package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5tO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129595tO {
    public static C130565v1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("scans_profile".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "ReelCoverImageInfo");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("url", "ReelCoverImageInfo");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "ReelCoverImageInfo");
                } else {
                    return new C130565v1(num.intValue(), str, str2, num2.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("scans_profile", "ReelCoverImageInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C130565v1 c130565v1) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c130565v1.A00);
        String str = c130565v1.A02;
        if (str != null) {
            anonymousClass182.A0S("scans_profile", str);
        }
        String str2 = c130565v1.A03;
        if (str2 != null) {
            anonymousClass182.A0S("url", str2);
        }
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c130565v1.A01);
        anonymousClass182.A0a();
    }
}
