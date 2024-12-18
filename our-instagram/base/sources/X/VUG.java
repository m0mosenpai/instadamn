package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUG {
    public static C68796VcD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68796VcD c68796VcD = new C68796VcD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cursor".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("node".equals(A0s)) {
                    c68796VcD.A00 = VUF.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68796VcD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
