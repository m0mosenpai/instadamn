package X;

import java.io.IOException;

/* renamed from: X.5Rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117085Rr {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4NO, java.lang.Object, X.5Rs] */
    public static C117095Rs parseFromJson(C16L c16l) {
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
                C4NT.A00(c16l, obj, A0q);
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
