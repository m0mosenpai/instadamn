package X;

import com.instagram.ui.text.TextShadow;
import java.io.IOException;

/* renamed from: X.A2c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22758A2c {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    public static TextShadow parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("distance_resource_id".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("radius_resource_id".equals(A0s)) {
                    obj.A02 = c16l.A1D();
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
