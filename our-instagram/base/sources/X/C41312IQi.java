package X;

import java.io.IOException;

/* renamed from: X.IQi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41312IQi {
    public static C39032HGi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C39032HGi c39032HGi = new C39032HGi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("lead_gen_deep_link_user_info_create".equals(AbstractC166997dE.A0s(c16l))) {
                    c39032HGi.A00 = I15.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c39032HGi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
