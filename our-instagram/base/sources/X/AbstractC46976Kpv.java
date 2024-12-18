package X;

import java.io.IOException;

/* renamed from: X.Kpv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46976Kpv {
    public static C31231eS parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31231eS c31231eS = new C31231eS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("status_reply".equals(A0s)) {
                    c31231eS.A00 = LCE.parseFromJson(c16l);
                } else if ("status_author_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31231eS.A01 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c31231eS, A0s);
                }
                c16l.A0z();
            }
            return c31231eS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
