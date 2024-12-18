package X;

import java.io.IOException;

/* renamed from: X.Kr3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47046Kr3 {
    public static C47454Kxj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C47454Kxj c47454Kxj = new C47454Kxj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c47454Kxj.A00 = A1P;
                }
                c16l.A0z();
            }
            return c47454Kxj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
