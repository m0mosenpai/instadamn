package X;

import java.io.IOException;

/* renamed from: X.5Kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115635Kz {
    public static C9C9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9C9 c9c9 = new C9C9(10);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("from_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9c9.A00 = str;
                } else if ("from_reel_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9c9.A01 = str;
                }
                c16l.A0z();
            }
            return c9c9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
