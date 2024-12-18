package X;

import java.io.IOException;

/* renamed from: X.16S, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16S {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.16T, java.lang.Object] */
    public static C16T parseFromJson(C16L c16l) {
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
                if ("user_info".equals(A0q)) {
                    obj.A01 = C16W.parseFromJson(c16l);
                } else if ("time_accessed".equals(A0q)) {
                    obj.A00 = c16l.A0y();
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
