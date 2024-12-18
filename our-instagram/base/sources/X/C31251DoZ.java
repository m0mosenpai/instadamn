package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.DoZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31251DoZ {
    public final UserSession A00;
    public final C18A A01;

    public C31251DoZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AnonymousClass189.A00(userSession);
    }

    public final Reel A00(C5HW c5hw) {
        C14360o3.A0B(c5hw, 0);
        User A02 = this.A01.A02(c5hw.A04.A0f);
        if (A02 == null) {
            C5HX c5hx = c5hw.A04;
            String str = c5hx.A0f;
            if (str != null && str.length() != 0) {
                A02 = new User(str, c5hx.A0h);
                A02.A0i(c5hw.A04.A0E);
            } else {
                C0w9.A01.EmO("ReelForNewsfeedStoryProvider", AnonymousClass001.A0O("Can not create user without user id (model.getProfileId()) for story type: ", c5hw.A00), 1000);
                return null;
            }
        }
        UserSession userSession = this.A00;
        Long l = c5hw.A04.A0T;
        C1OU c1ou = C1OU.$redex_init_class;
        if (C75653aW.A06(userSession, A02) && l != null) {
            Reel A0K = ReelStore.A03(userSession).A0K(new C1N9(A02), A02.getId(), false);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (l.longValue() + (AbstractC73343Qk.A00 / 1000) > currentTimeMillis - SandboxRepository.CACHE_TTL && !C41661wG.A00(userSession).A06(A0K, l)) {
                return A0K;
            }
        }
        return null;
    }
}
