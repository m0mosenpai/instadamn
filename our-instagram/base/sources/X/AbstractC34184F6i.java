package X;

import java.io.IOException;

/* renamed from: X.F6i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34184F6i {
    public static C34771kI parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34771kI c34771kI = new C34771kI();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c34771kI.A00 = A1P;
                } else if ("is_read_receipts_disabled".equals(A0q)) {
                    c34771kI.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34771kI, A0q);
                }
                c16l.A0z();
            }
            return c34771kI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
