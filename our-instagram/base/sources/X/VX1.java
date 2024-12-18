package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VX1 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.WiX] */
    public static C70867WiX parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("primary_color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("text_emphasis_mode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A01 = A2Y.A00(A1P);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
