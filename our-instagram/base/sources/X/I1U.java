package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1U {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1um, X.H9h, X.1ul] */
    public static C38859H9h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"viewer_vertical_swipe".equals(A0s) && !"profile_live_ring_enabled".equals(A0s) && !"home_adaptive_feed_enabled".equals(A0s) && !"filter_and_sort_enabled".equals(A0s)) {
                    if ("home_adaptive_feed_threshold".equals(A0s)) {
                        c16l.A1D();
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                } else {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
