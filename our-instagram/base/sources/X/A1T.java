package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1T {
    public static C9ZV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9ZV c9zv = new C9ZV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2303).equals(A0s)) {
                    c9zv.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("duration_ms".equals(A0s)) {
                    c9zv.A00 = c16l.A1D();
                } else if ("audio_asset_id".equals(A0s)) {
                    c9zv.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("audio_cluster_id".equals(A0s)) {
                    c9zv.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("start_time_ms".equals(A0s)) {
                    c9zv.A01 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c9zv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
