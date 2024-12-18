package X;

import java.io.IOException;

/* renamed from: X.Hsg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40217Hsg {
    public static H53 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ads_toggled_on".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("brand_safety_status_for_media_edit".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    bool2 = AbstractC37303Gc4.A0K(c16l, bool2, A0s, "is_media_eligible_for_inserting_ads");
                }
                c16l.A0z();
            }
            return new H53(bool, bool2, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
