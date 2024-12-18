package X;

import com.instagram.common.gallery.Medium;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226209yd {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Aky, java.lang.Object] */
    public static C24020Aky parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("medium".equals(A0s)) {
                    Medium parseFromJson = C8IR.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A02 = parseFromJson;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    obj.A00 = c16l.A1D();
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
}
