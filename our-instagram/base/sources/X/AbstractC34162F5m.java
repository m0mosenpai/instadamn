package X;

import java.io.IOException;

/* renamed from: X.F5m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34162F5m {
    public static C31851fT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31851fT c31851fT = new C31851fT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c31851fT.A00 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("mark_as_unread".equals(A0q)) {
                    c31851fT.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c31851fT, A0q);
                }
                c16l.A0z();
            }
            return c31851fT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
