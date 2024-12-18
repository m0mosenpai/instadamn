package X;

import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.EVe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32554EVe extends AbstractC61132qb {
    public final UserSession A00;

    public C32554EVe(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31820Dye(new AudienceListsListRepository(this.A00));
    }
}
