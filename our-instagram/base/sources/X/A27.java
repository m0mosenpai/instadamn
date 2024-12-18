package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A27 {
    public static C9ZL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9ZL c9zl = new C9ZL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2210).equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c9zl.A01 = A0m;
                } else if ("creator_username".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c9zl.A02 = A0m2;
                } else if ("media_id".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c9zl.A04 = A0m3;
                } else if ("question_id".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c9zl.A05 = A0m4;
                } else if ("reel_viewer_module".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    c9zl.A06 = A0m5;
                } else if (AbstractC43591JPw.A00(83).equals(A0s)) {
                    String A0m6 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m6, 0);
                    c9zl.A03 = A0m6;
                } else if ("tray_session_id".equals(A0s)) {
                    String A0m7 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m7, 0);
                    c9zl.A07 = A0m7;
                } else if ("tray_position".equals(A0s)) {
                    c9zl.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c9zl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
