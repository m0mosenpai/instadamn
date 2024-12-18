package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;

/* renamed from: X.EVq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32566EVq extends AbstractC61132qb {
    public final UserSession A00;

    public C32566EVq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C32940EeL((CreatorMessagingSelectionScreenRepository) userSession.A01(CreatorMessagingSelectionScreenRepository.class, new C37049GUf(userSession, 44)));
    }
}
