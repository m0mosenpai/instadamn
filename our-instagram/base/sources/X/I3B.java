package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3B {
    public static C38817H7h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C5FI c5fi = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("caption_info".equals(A0s)) {
                    c5fi = IR5.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("start_x_position".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("start_y_position".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1G(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return new C38817H7h(c5fi, num, num2, num3, num4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
