package X;

import java.io.IOException;

/* renamed from: X.5hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123105hl {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.5ho] */
    public static C123135ho parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C123125hn c123125hn = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("time_bucket".equals(A0q)) {
                    c123125hn = AbstractC123115hm.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c123125hn == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("time_bucket", "Partitions");
                throw C00O.createAndThrow();
            }
            ?? obj = new Object();
            obj.A00 = c123125hn;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
