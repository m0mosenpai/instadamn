package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IO6 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H8Y, X.1um, X.1ul] */
    public static H8Y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("welcome_video_media_info".equals(A0s)) {
                    c40791um.A00 = AbstractC111024zE.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C38583Gxm(c40791um.A00);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
