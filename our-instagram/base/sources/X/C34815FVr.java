package X;

import java.io.IOException;

/* renamed from: X.FVr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34815FVr {
    public static EDE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EDE ede = new EDE();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    ede.A00 = A0m;
                } else if ("uri".equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("render_type".equals(A0s)) {
                    c16l.A1D();
                } else if ("nonce".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    ede.A04 = A0m2;
                } else if ("uid".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    ede.A05 = A0m3;
                } else if ("cni".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    ede.A03 = A0m4;
                } else if ("bloks_action".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    ede.A01 = A0m5;
                } else if ("challenge_context".equals(A0s)) {
                    String A0m6 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m6, 0);
                    ede.A02 = A0m6;
                } else {
                    C55702hA.A01(c16l, ede, A0s);
                }
                c16l.A0z();
            }
            return ede;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
