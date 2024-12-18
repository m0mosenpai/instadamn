package X;

import java.io.IOException;

/* renamed from: X.6x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154546x4 {
    public static C1567071s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1567071s c1567071s = new C1567071s();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("broadcast".equals(A0q)) {
                    c1567071s.A02 = AbstractC108524ud.parseFromJson(c16l);
                } else if ("reel".equals(A0q)) {
                    c1567071s.A03 = AbstractC38741r6.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c1567071s, A0q);
                }
                c16l.A0z();
            }
            return c1567071s;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
