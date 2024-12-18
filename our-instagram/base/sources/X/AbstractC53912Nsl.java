package X;

import java.io.IOException;

/* renamed from: X.Nsl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53912Nsl {
    public static OA3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OA3 oa3 = new OA3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("last_save_time".equals(A0s)) {
                    oa3.A01 = c16l.A0y();
                } else if ("last_user_save_time".equals(A0s)) {
                    oa3.A02 = c16l.A0y();
                } else if ("last_precapture_save_time".equals(A0s)) {
                    oa3.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return oa3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
