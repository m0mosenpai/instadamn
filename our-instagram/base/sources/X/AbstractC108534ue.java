package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108534ue {
    public static C108544uf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "IgLiveDimensionsImpl");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "IgLiveDimensionsImpl");
            } else {
                return new C108544uf(num.intValue(), num2.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
