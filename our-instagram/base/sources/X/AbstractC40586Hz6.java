package X;

import java.io.IOException;

/* renamed from: X.Hz6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40586Hz6 {
    public static C40947IBu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40947IBu c40947IBu = new C40947IBu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(1309).equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if (AbstractC43591JPw.A00(291).equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c40947IBu.A00 = A0m;
                }
                c16l.A0z();
            }
            return c40947IBu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
