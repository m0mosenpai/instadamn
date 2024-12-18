package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;

/* renamed from: X.NBa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52259NBa extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NZZ A02 = OYB.A02(userSession);
        IgLiveJoinRequestsRepository igLiveJoinRequestsRepository = (IgLiveJoinRequestsRepository) A02.A02.getValue();
        MTU A03 = A02.A03();
        return new C53010Nci(AbstractC23021Ah.A00(userSession), igLiveJoinRequestsRepository, (IgLiveQuestionSubmissionsRepository) A02.A0C.getValue(), A02.A01(), A02.A02(), A03, C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 2342166213356039244L));
    }

    public C52259NBa(UserSession userSession) {
        this.A00 = userSession;
    }
}
