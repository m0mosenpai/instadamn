package X;

import java.io.IOException;

/* renamed from: X.62h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1337662h {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.62g, X.1um, X.1ul] */
    public static C1337562g parseFromJson(C16L c16l) {
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
                if ("pending_requests_total".equals(A0q)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("unread_pending_requests".equals(A0q)) {
                    c40791um.A01 = c16l.A1D();
                } else if ("notes".equals(A0q)) {
                    c40791um.A02 = AbstractC125555m1.parseFromJson(c16l);
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
