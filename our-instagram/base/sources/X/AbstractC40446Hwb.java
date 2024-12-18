package X;

import java.io.IOException;

/* renamed from: X.Hwb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40446Hwb {
    public static H71 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_ts".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("highlight_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "start_ts");
                }
                c16l.A0z();
            }
            return new H71(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
