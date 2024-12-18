package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC71963Ku {
    public static final int A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Iterator it = C0BQ.A00(userSession).BOf(C08730cb.A00(userSession).A00()).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((User) it.next()).A02();
        }
        return i;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        List<User> BOf = C0BQ.A00(userSession).BOf(C08730cb.A00(userSession).A00());
        if (!(BOf instanceof Collection) || !BOf.isEmpty()) {
            for (User user : BOf) {
                if (user.A02() > 0) {
                    return true;
                }
                ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
                C14360o3.A07(copyOf);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : copyOf.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
