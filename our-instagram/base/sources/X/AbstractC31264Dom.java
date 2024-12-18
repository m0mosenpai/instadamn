package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Dom, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31264Dom {
    public static final int A00(UserSession userSession) {
        int i;
        if (AbstractC54472f1.A03()) {
            return C3Ks.A01.A05(userSession, false);
        }
        Iterator it = C0BQ.A00(userSession).BOf(AbstractC166987dD.A10(userSession)).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ImmutableMap copyOf = ImmutableMap.copyOf(((User) it.next()).A05);
            C14360o3.A07(copyOf);
            Number number = (Number) copyOf.get(EnumC54222eY.A0I);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
