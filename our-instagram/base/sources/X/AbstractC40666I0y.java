package X;

import java.io.IOException;

/* renamed from: X.I0y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40666I0y {
    public static ICE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ICE ice = new ICE();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("is_eligible_for_ig_thank_you_page".equals(AbstractC166997dE.A0s(c16l))) {
                    ice.A00 = c16l.A0d();
                }
                c16l.A0z();
            }
            return ice;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
