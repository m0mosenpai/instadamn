package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I32 {
    public static C38815H7f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38814H7e c38814H7e = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("incentive".equals(AbstractC166997dE.A0s(c16l))) {
                    c38814H7e = I31.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38815H7f(c38814H7e);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
