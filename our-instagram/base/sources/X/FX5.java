package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FX5 {
    public static C32183ECe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32183ECe c32183ECe = new C32183ECe();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("invite_message".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c32183ECe.A00 = A0m;
                } else if ("invite_subject".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c32183ECe.A01 = A0m2;
                } else {
                    C55702hA.A01(c16l, c32183ECe, A0s);
                }
                c16l.A0z();
            }
            return c32183ECe;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
