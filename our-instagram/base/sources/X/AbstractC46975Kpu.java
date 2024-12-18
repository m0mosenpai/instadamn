package X;

import java.io.IOException;

/* renamed from: X.Kpu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46975Kpu {
    public static C31111eG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31111eG c31111eG = new C31111eG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(3130).equals(A0s)) {
                    c31111eG.A00 = AbstractC201078up.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c31111eG, A0s);
                }
                c16l.A0z();
            }
            return c31111eG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
