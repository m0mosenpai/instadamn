package X;

import java.io.IOException;

/* renamed from: X.Gmh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37943Gmh {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H8i, X.1um, X.1ul] */
    public static C38834H8i parseFromJson(C16L c16l) {
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
                if ("should_badge".equals(A0q)) {
                    c40791um.A01 = Boolean.valueOf(c16l.A0d());
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            c40791um.A00 = new C37944Gmi(AbstractC31172DnG.A1b(c40791um.A01));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
