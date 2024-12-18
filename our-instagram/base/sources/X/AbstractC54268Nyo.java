package X;

import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Nyo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54268Nyo {
    public static final String A00(User user, java.util.Set set) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (user != null) {
            A1C.append(user.getUsername());
        }
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                if (A1C.length() > 0) {
                    A1C.append(", ");
                }
                A1C.append(A15.getUsername());
            }
        }
        return AbstractC166987dD.A19(A1C);
    }
}
