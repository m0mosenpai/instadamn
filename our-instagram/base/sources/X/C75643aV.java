package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.3aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75643aV {
    public static final C75643aV A00 = new Object();

    public final Reel A00(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        User A2E = c38321qM.A2E(userSession);
        if (c38321qM.A4r() || c38321qM.A4j() || AbstractC41071vF.A0P(userSession, c38321qM) || A2E == null) {
            return null;
        }
        AnonymousClass341 anonymousClass341 = c75113Zb.A0o;
        if (anonymousClass341 != AnonymousClass341.A0H && anonymousClass341 != AnonymousClass341.A0A && anonymousClass341 != AnonymousClass341.A0U && anonymousClass341 != AnonymousClass341.A0I && anonymousClass341 != AnonymousClass341.A08) {
            return null;
        }
        C1OU c1ou = C1OU.$redex_init_class;
        return C75653aW.A02(userSession, A2E);
    }
}
