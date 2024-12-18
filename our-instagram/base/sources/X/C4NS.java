package X;

import java.io.IOException;

/* renamed from: X.4NS, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NS {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4NO, X.4NN, java.lang.Object] */
    public static C4NN parseFromJson(C16L c16l) {
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
