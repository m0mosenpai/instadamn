package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUN {
    public static C68799VcG parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68799VcG c68799VcG = new C68799VcG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68799VcG.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68799VcG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
