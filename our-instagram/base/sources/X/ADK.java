package X;

import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ADK {
    public static final void A00(C121395ef c121395ef, C121395ef c121395ef2) {
        if (c121395ef != null) {
            Iterator A0l = AbstractC167007dF.A0l(c121395ef.A04);
            while (A0l.hasNext()) {
                Object A0l2 = AbstractC166997dE.A0l(A0l);
                if (!c121395ef2.A04.containsKey(A0l2)) {
                    HashMap hashMap = c121395ef2.A04;
                    Object obj = c121395ef.A04.get(A0l2);
                    C14360o3.A0A(obj);
                    hashMap.put(A0l2, obj);
                }
            }
        }
    }

    public static final boolean A01(User user, String str) {
        String username = user.getUsername();
        String fullName = user.getFullName();
        if (!AbstractC13670mt.A0I(username, str, 0) && (fullName == null || fullName.length() == 0 || !AbstractC13670mt.A0H(fullName, str))) {
            return false;
        }
        return true;
    }
}
