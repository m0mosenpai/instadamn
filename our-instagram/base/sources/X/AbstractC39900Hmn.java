package X;

import java.io.IOException;

/* renamed from: X.Hmn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39900Hmn {
    public static H37 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("viewers".equals(AbstractC166997dE.A0s(c16l))) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return new H37(num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
