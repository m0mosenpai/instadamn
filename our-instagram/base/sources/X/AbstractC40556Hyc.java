package X;

import java.io.IOException;

/* renamed from: X.Hyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40556Hyc {
    public static IEI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IEI iei = new IEI();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    iei.A00 = A0m;
                } else if (AbstractC37300Gc1.A1C(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    iei.A01 = A0m2;
                }
                c16l.A0z();
            }
            return iei;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
