package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Wk, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Wk {
    public static final boolean A00(UserSession userSession, C41181vS c41181vS) {
        boolean z;
        String str;
        String str2;
        C14360o3.A0B(userSession, 0);
        List BlY = c41181vS.BlY(EnumC75383a5.A09);
        if (BlY != null && !BlY.isEmpty()) {
            for (Object obj : BlY) {
                C14360o3.A07(obj);
                String str3 = ((C84823qW) obj).A1o;
                if (str3 != null) {
                    User user = c41181vS.A0i;
                    if (user != null) {
                        str2 = user.getId();
                    } else {
                        str2 = null;
                    }
                    if (!str3.equals(str2)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36321460385883609L);
        String id = C08730cb.A00(userSession).A00().getId();
        User user2 = c41181vS.A0i;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = null;
        }
        if ((!C14360o3.A0K(id, str) || !C18U.A06(c06090Tz, userSession, 36321460385818072L)) && !A06) {
            return false;
        }
        return true;
    }
}
