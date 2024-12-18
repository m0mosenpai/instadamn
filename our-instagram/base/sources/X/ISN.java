package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class ISN {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HYr, X.HB3] */
    public static C39326HYr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? hb3 = new HB3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    hb3.A01 = AbstractC40738I3s.parseFromJson(c16l);
                } else if ("pivot".equals(A0s)) {
                    hb3.A02 = I6S.parseFromJson(c16l);
                } else if ("footer".equals(A0s)) {
                    hb3.A00 = AbstractC40737I3r.parseFromJson(c16l);
                } else {
                    C41660Ibs.A00(c16l, hb3, A0s);
                }
                c16l.A0z();
            }
            return hb3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
