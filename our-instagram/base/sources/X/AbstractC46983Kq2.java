package X;

import java.io.IOException;

/* renamed from: X.Kq2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46983Kq2 {
    public static C34991ke parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34991ke c34991ke = new C34991ke();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34991ke.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("sticker_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c34991ke.A02 = A1P;
                } else {
                    AbstractC43669JTd.A01(c16l, c34991ke, A0q);
                }
                c16l.A0z();
            }
            return c34991ke;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
