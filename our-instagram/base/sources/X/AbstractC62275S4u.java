package X;

import java.io.IOException;

/* renamed from: X.S4u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62275S4u {
    public static C62568SGt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C62568SGt c62568SGt = new C62568SGt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    c62568SGt.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("header".equals(A0s)) {
                    c62568SGt.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("overview_points".equals(A0s)) {
                    c62568SGt.A00 = AbstractC62274S4t.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c62568SGt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
