package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VT1 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Vtu] */
    public static C69699Vtu parseFromJson(C16L c16l) {
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
                    obj.A00 = (float) c16l.A0U();
                } else if ("y".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("zoom_level".equals(A0s)) {
                    obj.A02 = c16l.A1D();
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
