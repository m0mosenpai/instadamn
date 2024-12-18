package X;

import java.io.IOException;

/* renamed from: X.3kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81643kZ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3kX, java.lang.Object] */
    public static C81623kX parseFromJson(C16L c16l) {
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
                if ("text".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("instamadillo_cutover".equals(A0q)) {
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
