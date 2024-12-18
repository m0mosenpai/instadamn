package X;

import java.io.IOException;

/* renamed from: X.3kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81513kM {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C206349Br c206349Br = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("last_message".equals(A0q)) {
                    c206349Br = AbstractC109514wd.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C9BH(c206349Br, 8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
