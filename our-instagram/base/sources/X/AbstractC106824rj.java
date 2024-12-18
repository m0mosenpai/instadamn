package X;

import java.io.IOException;

/* renamed from: X.4rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106824rj {
    public static C106834rk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("end_timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("start_timestamp".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return new C106834rk(l, l2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
