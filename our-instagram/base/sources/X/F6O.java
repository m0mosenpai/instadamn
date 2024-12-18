package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6O {
    public static C29091am parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29091am c29091am = new C29091am();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                AbstractC43669JTd.A01(c16l, c29091am, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c29091am;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
