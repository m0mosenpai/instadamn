package X;

import java.io.IOException;

/* renamed from: X.KqW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47013KqW {
    public static C35331lF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35331lF c35331lF = new C35331lF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("key".equals(A0s)) {
                    c35331lF.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("message_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35331lF.A04 = A0m;
                } else if ("client_context".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35331lF.A02 = A0m2;
                } else if ("media_id".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c35331lF.A03 = A0m3;
                } else if ("media_intervention_type".equals(A0s)) {
                    c35331lF.A00 = c16l.A1D();
                } else if ("is_instamadillo".equals(A0s)) {
                    c35331lF.A06 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0s)) {
                    c35331lF.A05 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c35331lF, A0s);
                }
                c16l.A0z();
            }
            return c35331lF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
