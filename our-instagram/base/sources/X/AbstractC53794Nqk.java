package X;

import java.io.IOException;

/* renamed from: X.Nqk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53794Nqk {
    public static C51665Mrw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51665Mrw c51665Mrw = new C51665Mrw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c51665Mrw.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("timestamp".equals(A0q)) {
                    c51665Mrw.A01 = c16l.A0y();
                } else if ("media_count".equals(A0q)) {
                    c51665Mrw.A00 = c16l.A1D();
                } else if ("cover_image_version".equals(A0q)) {
                    c51665Mrw.A02 = AbstractC53795Nql.parseFromJson(c16l);
                } else if ("reel_type".equals(A0q)) {
                    c51665Mrw.A03 = AbstractC40281tw.A00(AbstractC167017dG.A0m(c16l));
                }
                c16l.A0z();
            }
            return c51665Mrw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
