package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VMI {
    public static C68669Va5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68669Va5 c68669Va5 = new C68669Va5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("backoff".equals(AbstractC166997dE.A0s(c16l))) {
                    c68669Va5.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c68669Va5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
