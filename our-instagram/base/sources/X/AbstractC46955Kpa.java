package X;

import java.io.IOException;

/* renamed from: X.Kpa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46955Kpa {
    public static C30761df parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30761df c30761df = new C30761df();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ar_effect".equals(A0s)) {
                    c30761df.A00 = LC6.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30761df.A01 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30761df, A0s);
                }
                c16l.A0z();
            }
            return c30761df;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
