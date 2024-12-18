package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU0 {
    public static C68783Vc0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68783Vc0 c68783Vc0 = new C68783Vc0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("top_posts".equals(AbstractC166997dE.A0s(c16l))) {
                    c68783Vc0.A00 = AbstractC68520VTz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68783Vc0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
