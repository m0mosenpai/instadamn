package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6XI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XI {
    public static final C6XI A00 = new Object();

    public static final void A00(UserSession userSession, User user, boolean z) {
        C14360o3.A0B(userSession, 1);
        C152136sy c152136sy = (C152136sy) userSession.A01(C152136sy.class, C152126sx.A00);
        c152136sy.A00.put(user.getId(), Boolean.valueOf(z));
    }

    public static final boolean A01(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 1);
        C1566471m c1566471m = (C1566471m) userSession.A01(C1566471m.class, C1566371l.A00);
        String id = user.getId();
        LruCache lruCache = c1566471m.A00;
        Boolean bool = (Boolean) lruCache.get(id);
        if (bool != null) {
            return bool.booleanValue();
        }
        List AY0 = user.A03.AY0();
        if (AY0 != null && AY0.contains(1)) {
            lruCache.put(user.getId(), true);
            return true;
        }
        return false;
    }

    public static final boolean A02(User user) {
        C14360o3.A0B(user, 0);
        if (user.A2C() && AbstractC19730y1.A00(AbstractC12960li.A00).A00.getBoolean("show_internal_badge", true)) {
            return true;
        }
        return false;
    }
}
