package X;

import java.io.IOException;

/* renamed from: X.F5o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34164F5o {
    public static C31951ff parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31951ff c31951ff = new C31951ff();
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
                    c31951ff.A00 = A1P;
                } else if ("is_mentions_mute".equals(A0q)) {
                    c31951ff.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c31951ff, A0q);
                }
                c16l.A0z();
            }
            return c31951ff;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
