package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV1 {
    public static C69007Vfj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69007Vfj c69007Vfj = new C69007Vfj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("page_index".equals(A0s)) {
                    c69007Vfj.A00 = c16l.A1D();
                } else if ("response_option_numeric_value".equals(A0s)) {
                    c69007Vfj.A01 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c69007Vfj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
