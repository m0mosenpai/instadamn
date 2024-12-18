package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV7 {
    public static C69128ViJ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C69128ViJ c69128ViJ = new C69128ViJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("option_numeric_value".equals(A0s)) {
                    c69128ViJ.A00 = c16l.A1D();
                } else if ("option_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c69128ViJ.A02 = A1P;
                } else if ("option_text".equals(A0s)) {
                    c69128ViJ.A01 = AbstractC69950VyQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69128ViJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
