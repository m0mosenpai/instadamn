package X;

import com.instagram.common.gallery.FaceCenter;
import java.io.IOException;

/* renamed from: X.9yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225939yC {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.common.gallery.FaceCenter] */
    public static FaceCenter parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("x".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("y".equals(A0s)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("confidence".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
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
