package X;

import java.io.IOException;

/* renamed from: X.Gl8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37854Gl8 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.H9w, X.1ul] */
    public static C38874H9w parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media".equals(A0q)) {
                    C38321qM A00 = C38321qM.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c40791um.A00 = A00;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
