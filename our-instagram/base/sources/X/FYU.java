package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FYU {
    public static EDL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EDL edl = new EDL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("review_status".equals(A0s)) {
                    edl.A00 = c16l.A1D();
                } else {
                    C55702hA.A01(c16l, edl, A0s);
                }
                c16l.A0z();
            }
            return edl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
