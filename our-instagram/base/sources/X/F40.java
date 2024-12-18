package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F40 {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31200Dnj c31200Dnj = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("postback".equals(AbstractC166997dE.A0s(c16l))) {
                    c31200Dnj = F41.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C51755Mte(c31200Dnj, 10);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
