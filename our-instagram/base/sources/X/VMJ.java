package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VMJ {
    public static Ve0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Ve0 ve0 = new Ve0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offset".equals(A0s)) {
                    ve0.A00 = c16l.A0y();
                } else if ("duplicate".equals(A0s)) {
                    ve0.A01 = c16l.A0d();
                }
                c16l.A0z();
            }
            return ve0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
