package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ovl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56125Ovl implements InterfaceC13000lm {
    public final C1BX A00;

    public C56125Ovl(UserSession userSession) {
        this.A00 = C1BX.A03.A02(AnonymousClass001.A0R(userSession.userId, "_hashtag_page_seen_media_cache"));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A09();
    }
}
