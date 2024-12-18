package X;

import java.io.IOException;

/* renamed from: X.Kpx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46978Kpx {
    public static C31151eK parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31151eK c31151eK = new C31151eK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("interactive_sticker".equals(A0s)) {
                    C26069Bfx parseFromJson = AbstractC46856Knp.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c31151eK.A00 = parseFromJson;
                } else if ("question_response_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31151eK.A01 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c31151eK, A0s);
                }
                c16l.A0z();
            }
            return c31151eK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
