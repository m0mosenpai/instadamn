package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F9L {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51755Mte c51755Mte = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC111324zv.A00(4180).equals(AbstractC166997dE.A0s(c16l))) {
                    c51755Mte = F9M.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C51755Mte(c51755Mte, 39);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
