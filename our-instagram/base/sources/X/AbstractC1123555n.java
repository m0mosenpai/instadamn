package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.55n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123555n {
    public static C1123655o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1123655o c1123655o = new C1123655o();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("x".equals(A0q)) {
                    c1123655o.A03 = new Float(c16l.A0U());
                } else if ("y".equals(A0q)) {
                    c1123655o.A04 = new Float(c16l.A0U());
                } else if ("z".equals(A0q)) {
                    c1123655o.A05 = Integer.valueOf(c16l.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c1123655o.A00 = new Float(c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c1123655o.A02 = new Float(c16l.A0U());
                } else if ("rotation".equals(A0q)) {
                    c1123655o.A01 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return c1123655o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
