package X;

import java.io.IOException;

/* renamed from: X.F3y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34122F3y {
    public static FKZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FKZ fkz = new FKZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MSV.A00(516).equals(A0s)) {
                    fkz.A00 = c16l.A1D();
                } else if ("last_updated".equals(A0s)) {
                    fkz.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("milestone_type".equals(A0s)) {
                    fkz.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return fkz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
