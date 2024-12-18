package X;

import java.io.IOException;

/* renamed from: X.5LE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5LE {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.5LF, X.1um, X.1ul] */
    public static C5LF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("sync_all_launchers".equals(A0q)) {
                    c40791um.A01 = c16l.A0d();
                } else if ("sync_all_qes".equals(A0q)) {
                    c16l.A0d();
                } else if ("sync_ep_launchers".equals(A0q)) {
                    c40791um.A02 = c16l.A0d();
                } else if ("cleanup_actions".equals(A0q)) {
                    c40791um.A00 = F7J.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
