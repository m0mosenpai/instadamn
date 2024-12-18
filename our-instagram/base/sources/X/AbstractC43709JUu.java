package X;

import java.io.IOException;

/* renamed from: X.JUu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43709JUu {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.5zm] */
    public static C133205zm parseFromJson(C16L c16l) {
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
                if ("cutover_timestamp".equals(A0q)) {
                    obj.A00 = Long.valueOf(c16l.A0y());
                } else if ("undo_cutover_timestamp".equals(A0q)) {
                    obj.A01 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
