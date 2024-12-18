package X;

import java.io.IOException;

/* renamed from: X.3XC, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XC {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3XD, java.lang.Object] */
    public static C3XD parseFromJson(C16L c16l) {
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
                if ("containermodule".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if ("should_prefetch".equals(A0q)) {
                    obj.A00 = c16l.A0d();
                } else if ("should_prefetch_thumbnails".equals(A0q)) {
                    c16l.A0d();
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
