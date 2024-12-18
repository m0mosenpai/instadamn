package X;

import java.io.IOException;

/* renamed from: X.F6e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34180F6e {
    public static C33351hx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33351hx c33351hx = new C33351hx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33351hx.A00 = AbstractC31172DnG.A0o(c16l);
                } else if (AbstractC43591JPw.A00(1017).equals(A0q)) {
                    c33351hx.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c33351hx, A0q);
                }
                c16l.A0z();
            }
            return c33351hx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
