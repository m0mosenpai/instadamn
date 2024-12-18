package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU1 {
    public static C68784Vc1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68784Vc1 c68784Vc1 = new C68784Vc1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("top_posts_unit".equals(AbstractC166997dE.A0s(c16l))) {
                    c68784Vc1.A00 = VU0.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68784Vc1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
