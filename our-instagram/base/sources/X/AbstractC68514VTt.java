package X;

import java.io.IOException;

/* renamed from: X.VTt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68514VTt {
    public static C69355Vm1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69355Vm1 c69355Vm1 = new C69355Vm1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reach_count".equals(A0s)) {
                    c69355Vm1.A00 = c16l.A1D();
                } else if ("attributed_follows".equals(A0s)) {
                    c69355Vm1.A01 = AbstractC68503VTi.parseFromJson(c16l);
                } else if ("attributed_profile_visits".equals(A0s)) {
                    c69355Vm1.A02 = AbstractC68505VTk.parseFromJson(c16l);
                } else if ("impressions".equals(A0s)) {
                    c69355Vm1.A03 = AbstractC68507VTm.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1188).equals(A0s)) {
                    c69355Vm1.A04 = AbstractC68511VTq.parseFromJson(c16l);
                } else if ("share_count".equals(A0s)) {
                    c69355Vm1.A05 = AbstractC68513VTs.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69355Vm1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
