package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4W {
    public static C41026IEv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41026IEv c41026IEv = new C41026IEv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("artist".equals(A0s)) {
                    c41026IEv.A00 = AbstractC38073Gp2.parseFromJson(c16l);
                } else if ("track".equals(A0s)) {
                    c41026IEv.A01 = AbstractC38073Gp2.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c41026IEv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
