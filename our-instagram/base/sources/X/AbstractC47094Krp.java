package X;

import java.io.IOException;

/* renamed from: X.Krp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47094Krp {
    public static C1OV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1OV c1ov = new C1OV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    c1ov.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("poll_id".equals(A0s)) {
                    c1ov.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(3306).equals(A0s)) {
                    c1ov.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("pre_viewer_voted_poll_option_index".equals(A0s)) {
                    c1ov.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("radio_type".equals(A0s)) {
                    c1ov.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("reel_viewer_module_name".equals(A0s)) {
                    c1ov.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("media_delivery_class".equals(A0s)) {
                    c1ov.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_session_id".equals(A0s)) {
                    c1ov.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_position".equals(A0s)) {
                    c1ov.A00 = c16l.A1D();
                } else if ("allow_vote_change".equals(A0s)) {
                    c1ov.A09 = c16l.A0d();
                } else if ("is_poll_vote_deletion_request".equals(A0s)) {
                    c1ov.A0A = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c1ov, A0s);
                }
                c16l.A0z();
            }
            return c1ov;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
