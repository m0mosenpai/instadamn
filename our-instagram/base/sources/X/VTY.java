package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTY {
    public static C69119Vi9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69119Vi9 c69119Vi9 = new C69119Vi9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c69119Vi9.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0q)) {
                    c69119Vi9.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31187DnW.A01().equals(A0q)) {
                    c69119Vi9.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69119Vi9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
