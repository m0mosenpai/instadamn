package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4G {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51755Mte c51755Mte = new C51755Mte(13);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("notification_time".equals(AbstractC166997dE.A0s(c16l))) {
                    c51755Mte.A00 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            return c51755Mte;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
