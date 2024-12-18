package X;

import java.io.IOException;

/* renamed from: X.Vz5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69986Vz5 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VkJ, java.lang.Object] */
    public static C69250VkJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("rect_left".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("rect_top".equals(A0s)) {
                    obj.A03 = c16l.A1D();
                } else if ("rect_right".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("rect_bottom".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C69250VkJ c69250VkJ) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("rect_left", c69250VkJ.A01);
        anonymousClass182.A0Q("rect_top", c69250VkJ.A03);
        anonymousClass182.A0Q("rect_right", c69250VkJ.A02);
        anonymousClass182.A0Q("rect_bottom", c69250VkJ.A00);
        anonymousClass182.A0a();
    }
}
