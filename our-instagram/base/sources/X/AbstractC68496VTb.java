package X;

import java.io.IOException;

/* renamed from: X.VTb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68496VTb {
    public static C69391Vmb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69391Vmb c69391Vmb = new C69391Vmb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("max_lines".equals(A0s)) {
                    c69391Vmb.A00 = c16l.A1D();
                } else if ("capitalization_style".equals(A0s)) {
                    c69391Vmb.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("font_family".equals(A0s)) {
                    c69391Vmb.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("font_size".equals(A0s)) {
                    c69391Vmb.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(1078).equals(A0s)) {
                    c69391Vmb.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("text_color".equals(A0s)) {
                    c69391Vmb.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("word_kerning".equals(A0s)) {
                    c69391Vmb.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69391Vmb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
