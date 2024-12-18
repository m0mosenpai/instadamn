package X;

import java.io.IOException;

/* renamed from: X.Krq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47095Krq {
    public static C26111Os parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26111Os c26111Os = new C26111Os();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c26111Os.A03 = A0m;
                } else if ("question_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c26111Os.A04 = A0m2;
                } else if ("reel_viewer_module_name".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c26111Os.A05 = A0m3;
                } else if ("media_delivery_class".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c26111Os.A02 = A0m4;
                } else if ("tray_session_id".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    c26111Os.A07 = A0m5;
                } else if ("is_clips_media".equals(A0s)) {
                    c26111Os.A09 = c16l.A0d();
                } else if ("upload_id".equals(A0s)) {
                    String A0m6 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m6, 0);
                    c26111Os.A08 = A0m6;
                } else if ("media_type".equals(A0s)) {
                    c26111Os.A00 = c16l.A1D();
                } else if (AbstractC58317Pt9.A00(29).equals(A0s)) {
                    String A0m7 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m7, 0);
                    c26111Os.A06 = A0m7;
                } else if ("tray_position".equals(A0s)) {
                    c26111Os.A01 = c16l.A1D();
                } else {
                    AbstractC43669JTd.A01(c16l, c26111Os, A0s);
                }
                c16l.A0z();
            }
            return c26111Os;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
