package X;

import java.io.IOException;

/* renamed from: X.Kq1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46982Kq1 {
    public static C30501dA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30501dA c30501dA = new C30501dA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(3310).equals(A0s)) {
                    c30501dA.A00 = AbstractC46853Knm.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30501dA, A0s);
                }
                c16l.A0z();
            }
            return c30501dA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
