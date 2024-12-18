package X;

import java.io.IOException;

/* renamed from: X.HvK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40373HvK {
    public static H6U parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H6W h6w = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38611qr c38611qr = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("question_list".equals(A0s)) {
                    h6w = IPM.parseFromJson(c16l);
                } else if ("simple_action".equals(A0s)) {
                    c38611qr = IRW.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H6U(h6w, c38611qr);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
