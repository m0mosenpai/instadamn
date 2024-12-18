package X;

import java.io.IOException;

/* renamed from: X.VTy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68519VTy {
    public static C68986VfO parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68986VfO c68986VfO = new C68986VfO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_next_page".equals(A0s)) {
                    c68986VfO.A01 = c16l.A0d();
                } else if ("end_cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68986VfO.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68986VfO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
