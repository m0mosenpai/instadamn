package X;

import java.io.IOException;

/* renamed from: X.Nso, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53915Nso {
    public static C51737MtK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51737MtK c51737MtK = new C51737MtK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("trim_start_time_ms".equals(A0s)) {
                    c51737MtK.A01 = c16l.A1D();
                } else if ("trim_end_time_ms".equals(A0s)) {
                    c51737MtK.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c51737MtK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
