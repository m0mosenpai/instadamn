package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUH {
    public static C68989VfR parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68989VfR c68989VfR = new C68989VfR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_next_page".equals(A0s)) {
                    c68989VfR.A01 = c16l.A0d();
                } else if ("end_cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68989VfR.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68989VfR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
