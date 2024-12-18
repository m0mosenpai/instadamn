package X;

import java.io.IOException;

/* renamed from: X.I2q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40710I2q {
    public static C115895Mf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37941pb c37941pb = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38736H4a c38736H4a = null;
            C37771pE c37771pE = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("broadcast".equals(A0s)) {
                    c37941pb = AbstractC108524ud.parseFromJson(c16l);
                } else if ("post_live_item".equals(A0s)) {
                    c38736H4a = AbstractC40154HrO.parseFromJson(c16l);
                } else if ("reel".equals(A0s)) {
                    c37771pE = AbstractC38741r6.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C115895Mf(c37941pb, c38736H4a, c37771pE);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
