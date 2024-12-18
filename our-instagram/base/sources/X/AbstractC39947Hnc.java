package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hnc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39947Hnc {
    public static H3R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("featured_user_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("group".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "num_total_notes");
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("group", c16l, "GroupNoteResponseInfoImpl");
                throw C00O.createAndThrow();
            }
            return new H3R(user, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
