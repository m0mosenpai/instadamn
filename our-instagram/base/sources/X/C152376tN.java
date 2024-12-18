package X;

import java.io.IOException;

/* renamed from: X.6tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152376tN {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6tM, X.1um, X.1ul] */
    public static C152366tM parseFromJson(C16L c16l) {
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
                if ("count".equals(A0q)) {
                    c40791um.A01 = Integer.valueOf(c16l.A1D());
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            Integer num = c40791um.A01;
            C14360o3.A0A(num);
            c40791um.A00 = new XNZ(num.intValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
