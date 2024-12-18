package X;

import java.io.IOException;

/* renamed from: X.407, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass407 {
    public static AnonymousClass408 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("x".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new AnonymousClass408(f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
