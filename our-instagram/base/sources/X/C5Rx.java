package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Rx, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Rx {
    public static C5Ry parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5Ry c5Ry = new C5Ry();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5Ry.A03 = str;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c5Ry.A02 = Integer.valueOf(c16l.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c5Ry.A01 = Integer.valueOf(c16l.A1D());
                } else if ("scale".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5Ry.A04 = str;
                }
                c16l.A0z();
            }
            c5Ry.A00();
            return c5Ry;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5Ry c5Ry) {
        anonymousClass182.A0d();
        String str = c5Ry.A03;
        if (str != null) {
            anonymousClass182.A0S("uri", str);
        }
        Integer num = c5Ry.A02;
        if (num != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num.intValue());
        }
        Integer num2 = c5Ry.A01;
        if (num2 != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
        }
        String str2 = c5Ry.A04;
        if (str2 != null) {
            anonymousClass182.A0S("scale", str2);
        }
        anonymousClass182.A0a();
    }
}
