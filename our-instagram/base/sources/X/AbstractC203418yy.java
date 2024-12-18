package X;

import java.io.IOException;

/* renamed from: X.8yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203418yy {
    public static C203428yz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C203428yz c203428yz = new C203428yz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("transform_matrix_params".equals(A0q)) {
                    c203428yz.A00 = C55c.A00(c16l);
                }
                c16l.A0z();
            }
            return c203428yz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
