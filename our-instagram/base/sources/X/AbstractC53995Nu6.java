package X;

import java.io.IOException;

/* renamed from: X.Nu6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53995Nu6 {
    public static C54532O7k parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54532O7k c54532O7k = new C54532O7k();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2725).equals(A0s)) {
                    c54532O7k.A00 = c16l.A1D();
                } else if (AbstractC111324zv.A00(4063).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54532O7k.A01 = A1P;
                }
                c16l.A0z();
            }
            return c54532O7k;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
