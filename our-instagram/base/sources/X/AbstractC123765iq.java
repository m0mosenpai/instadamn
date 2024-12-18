package X;

import java.io.IOException;

/* renamed from: X.5iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123765iq {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BH c9bh = new C9BH(9);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media_or_ad".equals(A0q)) {
                    c9bh.A00 = C38321qM.A0h.A0B(c16l, true);
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
