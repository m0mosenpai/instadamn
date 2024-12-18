package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU3 {
    public static C68786Vc3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68786Vc3 c68786Vc3 = new C68786Vc3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("organic".equals(AbstractC166997dE.A0s(c16l))) {
                    c68786Vc3.A00 = VU2.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68786Vc3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
