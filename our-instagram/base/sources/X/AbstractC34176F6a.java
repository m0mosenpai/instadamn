package X;

import java.io.IOException;

/* renamed from: X.F6a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34176F6a {
    public static C32471gX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32471gX c32471gX = new C32471gX();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c32471gX.A00 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("is_starred".equals(A0q)) {
                    c32471gX.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c32471gX, A0q);
                }
                c16l.A0z();
            }
            return c32471gX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
