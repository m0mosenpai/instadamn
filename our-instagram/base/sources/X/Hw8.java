package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hw8 {
    public static C38804H6t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38803H6s c38803H6s = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38805H6u c38805H6u = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("follow_info".equals(A0s)) {
                    c38803H6s = Hw6.parseFromJson(c16l);
                } else if ("repost_info".equals(A0s)) {
                    c38805H6u = AbstractC40418Hw9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38804H6t(c38803H6s, c38805H6u);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
