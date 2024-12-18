package X;

import java.io.IOException;

/* renamed from: X.9z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226479z4 {
    public static Al2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Al2 al2 = new Al2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("file_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    al2.A04 = A1P;
                } else if (AbstractC111324zv.A00(4196).equals(A0s)) {
                    al2.A02 = c16l.A1D();
                } else if (AbstractC111324zv.A00(4195).equals(A0s)) {
                    al2.A01 = c16l.A1D();
                } else if ("orientation".equals(A0s)) {
                    al2.A03 = c16l.A1D();
                } else if (AbstractC111324zv.A00(4182).equals(A0s)) {
                    al2.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return al2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
