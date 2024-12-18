package X;

import com.instagram.common.gallery.Medium;
import java.io.IOException;

/* renamed from: X.9yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226089yR {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6RO, X.9kM, java.lang.Object] */
    public static C217899kM parseFromJson(C16L c16l) {
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
                } else if ("max_width".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("max_height".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else {
                    ADU.A01(c16l, obj, A0s);
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
