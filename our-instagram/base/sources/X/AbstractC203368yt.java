package X;

import java.io.IOException;

/* renamed from: X.8yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203368yt {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BH c9bh = new C9BH(5);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("reel_more_options_model".equals(A0q)) {
                    c9bh.A00 = AbstractC203378yu.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c9bh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
