package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4O {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C206209Bd c206209Bd = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("one_click_upsell".equals(AbstractC166997dE.A0s(c16l))) {
                    c206209Bd = AbstractC126465nh.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C51755Mte(c206209Bd, 15);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
