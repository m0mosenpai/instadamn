package X;

import java.io.IOException;

/* renamed from: X.F5c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34152F5c {
    public static C32331gJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32331gJ c32331gJ = new C32331gJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c32331gJ.A00 = AbstractC31172DnG.A0o(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32331gJ, A0q);
                }
                c16l.A0z();
            }
            return c32331gJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
