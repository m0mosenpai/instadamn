package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F9M {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("enabled".equals(AbstractC166997dE.A0s(c16l))) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C51755Mte(bool, 40);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
