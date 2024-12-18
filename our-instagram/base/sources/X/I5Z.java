package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I5Z {
    public static C41160IJz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41160IJz c41160IJz = new C41160IJz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1J(A0s)) {
                    c41160IJz.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("slider_id".equals(A0s)) {
                    c41160IJz.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("vote".equals(A0s)) {
                    c41160IJz.A01 = AbstractC41344IRp.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(51).equals(A0s)) {
                    c41160IJz.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(83).equals(A0s)) {
                    c41160IJz.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_session_id".equals(A0s)) {
                    c41160IJz.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_position".equals(A0s)) {
                    c41160IJz.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c41160IJz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
