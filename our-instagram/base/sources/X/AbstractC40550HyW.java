package X;

import java.io.IOException;

/* renamed from: X.HyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40550HyW {
    public static C40938IBl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C40938IBl c40938IBl = new C40938IBl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC111324zv.A00(2297).equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c40938IBl.A00 = A1P;
                }
                c16l.A0z();
            }
            return c40938IBl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
