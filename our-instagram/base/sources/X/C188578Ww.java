package X;

import java.io.IOException;

/* renamed from: X.8Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188578Ww {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Wv, X.1um, X.1ul] */
    public static C188568Wv parseFromJson(C16L c16l) {
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
                if ("unlockable_sticker_nux_info".equals(A0q)) {
                    c40791um.A00 = A01.parseFromJson(c16l);
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
