package X;

import java.io.IOException;

/* renamed from: X.VxJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69892VxJ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Uyd, X.1um, X.1ul] */
    public static C67804Uyd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_valid_business_user_access_token".equals(A0s)) {
                    c40791um.A00 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
