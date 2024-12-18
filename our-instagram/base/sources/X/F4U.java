package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4U {
    public static C45127Jxw parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C45127Jxw c45127Jxw = new C45127Jxw(44);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC34875FYk.A00(30, 8, 0).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c45127Jxw.A01 = A1P;
                } else if ("profile_pic_url".equals(A0s)) {
                    c45127Jxw.A00 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return c45127Jxw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
