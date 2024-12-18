package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I15 {
    public static ICH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ICH ich = new ICH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("lead_gen_deep_link_user_status".equals(AbstractC166997dE.A0s(c16l))) {
                    ich.A00 = I14.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ich;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
