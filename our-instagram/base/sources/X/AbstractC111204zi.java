package X;

import java.io.IOException;

/* renamed from: X.4zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111204zi {
    public static C111214zj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C111214zj c111214zj = new C111214zj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ad_id".equals(A0q)) {
                    c111214zj.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c111214zj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
