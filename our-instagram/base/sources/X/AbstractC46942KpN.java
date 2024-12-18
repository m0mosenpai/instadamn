package X;

import java.io.IOException;

/* renamed from: X.KpN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46942KpN {
    public static C31771fL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31771fL c31771fL = new C31771fL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("seen_marker".equals(A0s)) {
                    c31771fL.A00 = AbstractC46840KnZ.parseFromJson(c16l);
                } else if ("is_ae".equals(A0s)) {
                    c31771fL.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c31771fL, A0s);
                }
                c16l.A0z();
            }
            return c31771fL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
