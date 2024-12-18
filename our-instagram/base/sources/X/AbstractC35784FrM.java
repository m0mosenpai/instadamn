package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

/* renamed from: X.FrM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35784FrM implements CallerContextable {
    public static final String __redex_internal_original_name = "CrosspostingDestinationUtil";

    @Deprecated(message = "Use Service Cache API")
    public static final InterfaceC81833l1 A00(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 1);
        long currentTimeMillis = System.currentTimeMillis() - user.A01;
        if (user.A03.BNa() != null && currentTimeMillis > TimeUnit.HOURS.toMillis(24L)) {
            C81823l0 c81823l0 = new C81823l0(null, null);
            user.A01 = System.currentTimeMillis();
            user.A03.EYE(c81823l0);
            AbstractC31172DnG.A1R(userSession, user);
            user.A0c(userSession);
            Integer num = C05F.A0O;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("stale_destination_duration_in_ms", String.valueOf(currentTimeMillis));
            C9J8.A00(userSession, false, num, null, null, A1G);
        }
        return user.A03.BNa();
    }

    public static final void A01(UserSession userSession, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        C9J8.A00(userSession, Boolean.valueOf(A1Y), C05F.A0A, str, null, null);
    }
}
