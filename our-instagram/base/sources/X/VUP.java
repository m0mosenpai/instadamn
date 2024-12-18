package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUP {
    public static C68991VfT parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68991VfT c68991VfT = new C68991VfT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tagline".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68991VfT.A01 = A1P;
                } else if ("photo".equals(A0s)) {
                    c68991VfT.A00 = VUO.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68991VfT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
