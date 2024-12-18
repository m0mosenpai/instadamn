package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV9 {
    public static C69130ViL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69130ViL c69130ViL = new C69130ViL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c69130ViL.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("intro_text".equals(A0q)) {
                    c69130ViL.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("outro_text".equals(A0q)) {
                    c69130ViL.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69130ViL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
