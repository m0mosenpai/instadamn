package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F91 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.F90, java.lang.Object] */
    public static F90 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("replay_expiring_at_us".equals(A0s)) {
                    c16l.A0y();
                } else if ("expiring_media_seen_count".equals(A0s)) {
                    c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
