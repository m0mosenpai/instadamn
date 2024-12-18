package X;

import java.io.IOException;

/* renamed from: X.HqX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40105HqX {
    public static C38237Grg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38236Grf c38236Grf = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("suggested_user_result_info_dict".equals(AbstractC166997dE.A0s(c16l))) {
                    c38236Grf = AbstractC40360Hv6.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38237Grg(c38236Grf);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
