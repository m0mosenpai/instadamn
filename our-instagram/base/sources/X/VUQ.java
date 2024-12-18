package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUQ {
    public static C68992VfU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68992VfU c68992VfU = new C68992VfU();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    c68992VfU.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("header".equals(A0s)) {
                    c68992VfU.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c68992VfU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
