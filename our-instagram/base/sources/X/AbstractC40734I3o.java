package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.I3o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40734I3o {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HjR, java.lang.Object] */
    public static C39695HjR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("row_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("row_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("merchant", c16l, "ContinueShoppingRow");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("row_title", c16l, "ContinueShoppingRow");
            } else {
                ?? obj = new Object();
                obj.A00 = user;
                obj.A02 = str;
                obj.A01 = str2;
                return obj;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
