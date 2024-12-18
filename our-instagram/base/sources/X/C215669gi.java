package X;

import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* renamed from: X.9gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215669gi extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C9U0(userSession, new AvatarStickerInteractor(null, userSession, 30));
    }

    public C215669gi(UserSession userSession) {
        this.A00 = userSession;
    }
}
