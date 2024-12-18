package X;

import java.io.IOException;

/* renamed from: X.5Rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116945Rd {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.5Re] */
    public static C116955Re parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("surface".equals(A0q)) {
                    obj.A01 = Integer.valueOf(c16l.A1D());
                } else if ("data".equals(A0q)) {
                    obj.A00 = AbstractC116965Rf.parseFromJson(c16l);
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
