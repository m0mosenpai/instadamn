package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU5 {
    public static C68788Vc5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68788Vc5 c68788Vc5 = new C68788Vc5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("organic".equals(AbstractC166997dE.A0s(c16l))) {
                    c68788Vc5.A00 = VU4.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68788Vc5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
