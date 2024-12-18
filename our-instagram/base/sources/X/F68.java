package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F68 {
    public static C29121ap parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29121ap c29121ap = new C29121ap();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                AbstractC43669JTd.A01(c16l, c29121ap, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c29121ap;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
