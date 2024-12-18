package X;

import java.io.IOException;

/* renamed from: X.F5b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34151F5b {
    public static C32371gN parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32371gN c32371gN = new C32371gN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c32371gN.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("session_id_from_call".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c32371gN.A01 = A1P;
                } else {
                    AbstractC43669JTd.A01(c16l, c32371gN, A0q);
                }
                c16l.A0z();
            }
            return c32371gN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
