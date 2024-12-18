package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV0 {
    public static C69126ViH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69126ViH c69126ViH = new C69126ViH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("length".equals(A0s)) {
                    c69126ViH.A00 = c16l.A1D();
                } else if ("offset".equals(A0s)) {
                    c69126ViH.A01 = c16l.A1D();
                } else if ("entity".equals(A0s)) {
                    c69126ViH.A02 = AbstractC68546VUz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69126ViH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
