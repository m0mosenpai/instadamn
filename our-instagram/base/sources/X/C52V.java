package X;

import java.io.IOException;

/* renamed from: X.52V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52V {
    public static C52W parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C52W c52w = new C52W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("file_path".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c52w.A01 = A1P;
                } else if ("duration".equals(A0q)) {
                    c52w.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c52w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
