package X;

import java.io.IOException;

/* renamed from: X.1IG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1IG {
    public static C1IH parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C1IH c1ih = new C1IH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("key".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c1ih.A02 = A1P;
                } else if ("fetchedTimeMs".equals(A0q)) {
                    c1ih.A00 = c16l.A0y();
                } else if ("rankedTimeMs".equals(A0q)) {
                    c1ih.A01 = c16l.A0y();
                } else if ("seen".equals(A0q)) {
                    c1ih.A03 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c1ih;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
