package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cdo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28302Cdo {
    public static final void A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC167017dG.A0g(A0x, "seen_double_tap_comment_to_like_nux_count").apply();
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.E7G("seen_double_tap_comment_to_like_nux_time", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        ARD.apply();
    }

    public static final boolean A01(C169277h1 c169277h1, C166047bW c166047bW, C168497fj c168497fj, UserSession userSession, C115925Mi c115925Mi) {
        C14360o3.A0B(userSession, 0);
        return AbstractC166987dD.A0x(userSession).getInt("seen_share_comment_nux_count", 0) < 1 && C28422CgU.A00.A02(c169277h1, c166047bW, c168497fj, userSession, c115925Mi) && !C18U.A06(C06090Tz.A05, userSession, 36322967919667996L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (AbstractC167017dG.A1b(A00, A00.A8O, C23031Ai.A8c, 85)) {
            return false;
        }
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        if (interfaceC19630xq.getInt("seen_double_tap_comment_to_like_nux_count", 0) >= 3 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - interfaceC19630xq.getLong("seen_double_tap_comment_to_like_nux_time", 0L) <= SandboxRepository.CACHE_TTL) {
            return false;
        }
        return true;
    }
}
