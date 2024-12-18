package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.LCk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47864LCk {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.L4t, java.lang.Object] */
    public static C47712L4t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("url".equals(A0s)) {
                    obj.A05 = AbstractC222616c.A00(c16l);
                } else if ("webp".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("mp4".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("size".equals(A0s)) {
                    obj.A02 = c16l.A0y();
                } else if ("webp_size".equals(A0s)) {
                    obj.A04 = c16l.A0y();
                } else if ("mp4_size".equals(A0s)) {
                    obj.A03 = c16l.A0y();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C47712L4t c47712L4t) {
        anonymousClass182.A0d();
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c47712L4t.A00);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c47712L4t.A01);
        if (c47712L4t.A05 != null) {
            anonymousClass182.A0r("url");
            AbstractC222616c.A01(anonymousClass182, c47712L4t.A05);
        }
        String str = c47712L4t.A07;
        if (str != null) {
            anonymousClass182.A0S("webp", str);
        }
        String str2 = c47712L4t.A06;
        if (str2 != null) {
            anonymousClass182.A0S("mp4", str2);
        }
        anonymousClass182.A0R("size", c47712L4t.A02);
        anonymousClass182.A0R("webp_size", c47712L4t.A04);
        anonymousClass182.A0R("mp4_size", c47712L4t.A03);
        anonymousClass182.A0a();
    }
}
