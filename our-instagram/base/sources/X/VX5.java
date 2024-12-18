package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VX5 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VgJ] */
    public static VgJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("point_x".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("point_y".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
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
}
