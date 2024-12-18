package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Ety, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33648Ety {
    /* JADX WARN: Type inference failed for: r2v2, types: [X.FIE, java.lang.Object] */
    public static FIE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Z(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("link_time".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (user != null) {
                obj.A01 = user;
            }
            if (l != null) {
                obj.A00 = l.longValue();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
