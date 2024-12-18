package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class S5L {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.SF5, java.lang.Object] */
    public static SF5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_accepting_questions".equals(A0s)) {
                    obj.A01 = c16l.A0d();
                } else if (MSV.A00(224).equals(A0s)) {
                    obj.A00 = c16l.A1D();
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
