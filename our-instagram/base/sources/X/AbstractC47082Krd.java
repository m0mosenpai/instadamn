package X;

import java.io.IOException;

/* renamed from: X.Krd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47082Krd {
    public static C40341u2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40341u2 c40341u2 = new C40341u2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C16V.A02(c16l);
                c16l.A0z();
            }
            return c40341u2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
