package X;

import java.io.IOException;

/* renamed from: X.Dpy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31333Dpy {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.EBc, X.1ul] */
    public static C32155EBc parseFromJson(C16L c16l) {
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
                if (!"media_or_ad".equals(A0q) && !"media".equals(A0q)) {
                    C55702hA.A01(c16l, c40791um, A0q);
                } else {
                    c40791um.A00 = C38321qM.A0h.A0C(c16l, true, false);
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
