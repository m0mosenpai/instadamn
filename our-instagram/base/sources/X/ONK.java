package X;

import com.instagram.api.schemas.Achievement;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class ONK {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.N2N, X.1um, X.1ul] */
    public static N2N parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("achievement".equals(A0s)) {
                    c40791um.A00 = AbstractC53769NqL.parseFromJson(c16l);
                } else if ("guidance_tip".equals(A0s)) {
                    c40791um.A02 = AbstractC39952Hnh.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Achievement achievement = c40791um.A00;
            C14360o3.A0A(achievement);
            c40791um.A01 = new C26119Bh3(achievement, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
