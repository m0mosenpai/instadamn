package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;

/* renamed from: X.EVh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32557EVh extends AbstractC61132qb {
    public final UserSession A00;

    public C32557EVh(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C31817Dyb(userSession, (ChannelXpostingRepository) userSession.A01(ChannelXpostingRepository.class, new C37014GSt(userSession, 5)));
    }
}
